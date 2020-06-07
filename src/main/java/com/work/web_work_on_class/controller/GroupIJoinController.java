package com.work.web_work_on_class.controller;

import com.work.web_work_on_class.filter.annotation.LoginRequire;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.service.GroupIJoinService;
import com.work.web_work_on_class.util.UniversalResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:8080","*"})
public class GroupIJoinController {
    @Resource
    private GroupIJoinService groupIJoinService;

    @GetMapping("/group/join/me")
    @LoginRequire("user")
    public UniversalResponseBody getGroupUserJoin(HttpSession session){
        User user = (User)session.getAttribute("userInfo");
        return new UniversalResponseBody(0,"success",groupIJoinService.getGroupIJoin(user.getUserId()));

    }
}
