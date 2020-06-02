package com.work.web_work_on_class.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.model.UserGroupRelation;
import com.work.web_work_on_class.service.UserGroupRelationService;
import com.work.web_work_on_class.util.String2DateUtils;
import com.work.web_work_on_class.util.UniversalResponseBody;

@RestController
public class JoinController {

	@Autowired
	UserGroupRelationService userGroupRelationService;
	
	@PostMapping("/ProjectGroup/join")
	public UniversalResponseBody register(@RequestParam("groupId")String groupId,
            							  HttpSession session){
		Date joinTime = new Date();
		Integer groupId1 = Integer.valueOf(groupId);
		Integer userId = ((User) (session.getAttribute("userInfo"))).getUserId();
		String nickyName = ((User) (session.getAttribute("userInfo"))).getUserNickName();
		UserGroupRelation record = new UserGroupRelation(userId, groupId1, nickyName, joinTime);
		if(userGroupRelationService.addUserGroupRelation(record)){
			return new UniversalResponseBody(0,"success");
		}else{
			return new UniversalResponseBody(-1,"error");
		}
	}
	
}
