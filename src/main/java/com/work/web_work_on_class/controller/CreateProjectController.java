package com.work.web_work_on_class.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.model.UserGroupRelation;
import com.work.web_work_on_class.service.ProjectGroupService;
import com.work.web_work_on_class.service.UserGroupRelationService;
import com.work.web_work_on_class.util.String2DateUtils;
import com.work.web_work_on_class.util.UniversalResponseBody;

@RestController
public class CreateProjectController {

	@Autowired
	ProjectGroupService projectGroupService;
	@Autowired
	UserGroupRelationService userGroupRelationService;
	
	@PostMapping("/ProjectGroup/new")
    public UniversalResponseBody register(@RequestParam("groupName")String groupName,
                                          @RequestParam("groupBeginDate")String groupBeginDate,
                                          @RequestParam("groupEndDate")String groupEndDate,
                                          @RequestParam("groupCanBeSearch")String groupCanBeSearch,
                                          @RequestParam("groupIntroduction")String groupIntroduction,
                                          HttpSession session){
		Date groupBeginDate1 = String2DateUtils.parseDateStr(groupBeginDate);
		Date groupEndDate1 = String2DateUtils.parseDateStr(groupEndDate);
		//这里下一行需要改!!!!!!!!!!!
		Integer groupCanBeSearch1 = Integer.valueOf(groupCanBeSearch);
		Integer groupCreater = ((User) (session.getAttribute("userInfo"))).getUserId();
		String nickyName = ((User) (session.getAttribute("userInfo"))).getUserNickName();
		Date joinTime = new Date();
		ProjectGroup record = new ProjectGroup(groupName, groupBeginDate1, groupEndDate1, groupCanBeSearch1, groupCreater, groupIntroduction);
        if(projectGroupService.addNewGroup(record)){
        	Integer userId = record.getGroupId();
        	UserGroupRelation record2 = new UserGroupRelation(groupCreater, userId, nickyName, joinTime);
        	userGroupRelationService.addUserGroupRelation(record2);
        	return new UniversalResponseBody(0,"success");
        }else{
            return new UniversalResponseBody(-1,"error");
        }
    }
	
}
