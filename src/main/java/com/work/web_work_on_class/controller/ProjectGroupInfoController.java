package com.work.web_work_on_class.controller;

import com.work.web_work_on_class.filter.annotation.LoginRequire;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.service.ProjectGroupService;
import com.work.web_work_on_class.util.UniversalResponseBody;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:8080","*"})
public class ProjectGroupInfoController {
    @Resource
    private ProjectGroupService projectGroupService;


    @GetMapping("/creator/group")
    @LoginRequire("user")
    public UniversalResponseBody getGroupByCreator(HttpSession session){
        User creator = (User)session.getAttribute("userInfo");
        return new UniversalResponseBody(0,"success",projectGroupService.getGroupByCreatorId(creator.getUserId()));
    }
}
