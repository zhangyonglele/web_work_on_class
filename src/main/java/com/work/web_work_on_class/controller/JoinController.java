package com.work.web_work_on_class.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
	UserGroupRelationService userGroupRelationService;
	
	@PostMapping("/ProjectGroup/join")
	@LoginRequire("user")
	public UniversalResponseBody register(@RequestParam("groupId")int groupId,
            							  HttpSession session){
		Date joinTime = new Date();
		Integer userId = ((User) (session.getAttribute("userInfo"))).getUserId();
		String nickyName = ((User) (session.getAttribute("userInfo"))).getUserNickName();
		UserGroupRelation record = new UserGroupRelation(userId, groupId, nickyName, joinTime);
		if(userGroupRelationService.addUserGroupRelation(record)){
			return new UniversalResponseBody(0,"success");
		}else{
			return new UniversalResponseBody(-1,"error");
		}
	}
	
}
