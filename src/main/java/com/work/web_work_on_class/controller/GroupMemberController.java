package com.work.web_work_on_class.controller;

import com.work.web_work_on_class.filter.annotation.LoginRequire;
import com.work.web_work_on_class.service.GroupMemberService;
import com.work.web_work_on_class.util.UniversalResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GroupMemberController {
    @Resource
    private GroupMemberService groupMemberService;

    @GetMapping("/group/member/{groupId}")
    @LoginRequire("user")
    public UniversalResponseBody getMember(@PathVariable("groupId")int groupId){
        return new UniversalResponseBody(0,"success",groupMemberService.getGroupMember(groupId));
    }
}
