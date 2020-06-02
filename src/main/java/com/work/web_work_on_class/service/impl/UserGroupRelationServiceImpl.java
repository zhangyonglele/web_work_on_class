package com.work.web_work_on_class.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.work.web_work_on_class.mapper.UserGroupRelationMapper;
import com.work.web_work_on_class.model.UserGroupRelation;
import com.work.web_work_on_class.service.UserGroupRelationService;

public class UserGroupRelationServiceImpl implements UserGroupRelationService {
	
	@Autowired
	UserGroupRelationMapper userGroupRelationMapper;

	@Override
	public boolean addUserGroupRelation(UserGroupRelation userGroupRelation) {
		try {
			userGroupRelationMapper.insert(userGroupRelation);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
