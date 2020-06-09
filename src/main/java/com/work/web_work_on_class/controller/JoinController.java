package com.work.web_work_on_class.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.work.web_work_on_class.filter.annotation.CreatorAuthRequire;
import com.work.web_work_on_class.service.combine.JoinGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.work.web_work_on_class.filter.annotation.LoginRequire;
import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.model.UserGroupRelation;
import com.work.web_work_on_class.service.UserGroupRelationService;
import com.work.web_work_on_class.util.String2DateUtils;
import com.work.web_work_on_class.util.UniversalResponseBody;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:8080","*"})
public class JoinController {

	@Resource
	private JoinGroupService joinGroupService;
	
	@PostMapping("/ProjectGroup/join")
	@LoginRequire("user")
	@CreatorAuthRequire
	public UniversalResponseBody register(@RequestParam("groupId")int groupId,@RequestParam("account")String account,
            							  HttpSession session){
		if(joinGroupService.JoinGroup(groupId,account)){
			return new UniversalResponseBody(0,"success");
		}else{
			return new UniversalResponseBody(-1,"error");
		}
	}
	
}
