package com.work.web_work_on_class.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.work.web_work_on_class.mapper.UserGroupRelationMapper;
import com.work.web_work_on_class.model.UserGroupRelation;
import com.work.web_work_on_class.service.UserGroupRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class UserGroupRelationServiceImpl implements UserGroupRelationService {
	
	@Resource
	UserGroupRelationMapper userGroupRelationMapper;

	@Override
	public boolean addUserGroupRelation(int userId,int groupId) {
		UserGroupRelation relation = new UserGroupRelation();
		relation.setGroupId(groupId);
		relation.setUserId(userId);
		relation.setJoinTime(new Date());
		relation.setNickyName("default");
		boolean flag = false;
		try {
			userGroupRelationMapper.insert(relation);
			flag =  true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
