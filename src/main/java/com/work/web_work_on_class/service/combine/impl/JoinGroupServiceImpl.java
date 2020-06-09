package com.work.web_work_on_class.service.combine.impl;

import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.service.UserGroupRelationService;
import com.work.web_work_on_class.service.UserService;
import com.work.web_work_on_class.service.combine.JoinGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JoinGroupServiceImpl implements JoinGroupService {
    @Resource
    private UserGroupRelationService userGroupRelationService;

    @Resource
    private UserService userService;

    @Override
    public boolean JoinGroup(int groupId, String userAccount) {
        User user = userService.getUserByEmail(userAccount);
        boolean flag = false;
        if(user != null){
            if(userGroupRelationService.addUserGroupRelation(user.getUserId(),groupId)){
                flag = true;
            }
        }
        return flag;
    }
}
