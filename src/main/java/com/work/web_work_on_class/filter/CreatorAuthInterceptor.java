package com.work.web_work_on_class.filter;

import com.work.web_work_on_class.filter.annotation.CreatorAuthRequire;
import com.work.web_work_on_class.filter.annotation.GroupAuthRequire;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.service.ProjectGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class CreatorAuthInterceptor implements HandlerInterceptor {
    @Resource
    private ProjectGroupService projectGroupService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod)handler;
            Method method = handlerMethod.getMethod();
            CreatorAuthRequire creatorAuthRequire = method.getAnnotation(CreatorAuthRequire.class);
            if(creatorAuthRequire == null){
                creatorAuthRequire = method.getDeclaringClass().getAnnotation(CreatorAuthRequire.class);
            }
            if(creatorAuthRequire != null){
                HttpSession session = request.getSession();
                User userInfo = (User) session.getAttribute("userInfo");
                //尝试获取session中的授权信息
                if(userInfo != null){
                    int userId = userInfo.getUserId();
                    Integer groupId = null;
                    try {
                        groupId = Integer.parseInt(request.getParameter("groupId"));
                    }catch (NumberFormatException e){
                        log.warn("[WARRING CHECK]No auth try to access!");
                        response.setStatus(403);
                        response.setContentType("application/json;charset=UTF-8");
                        response.getWriter().write("{\"errCode\":-1,\"msg\":\"group ID format error\"}");
                        return false;
                    }
                    if(projectGroupService.checkICreateGroupOrNot(groupId,userId)){
                        return true;
                    }
                }
                //如果权限越界，则拒绝请求
                log.warn("[WARRING CHECK]No auth try to access!");
                response.setStatus(403);
                response.setContentType("application/json;charset=UTF-8");
                response.getWriter().write("{\"errCode\":-1,\"msg\":\"auth refuse\"}");
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
