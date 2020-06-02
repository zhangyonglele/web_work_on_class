package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.model.UserGroupRelation;

public interface UserGroupRelationMapper {
    int deleteByPrimaryKey(Integer relationId);

    int insert(UserGroupRelation record);

    int insertSelective(UserGroupRelation record);

    UserGroupRelation selectByPrimaryKey(Integer relationId);

    int updateByPrimaryKeySelective(UserGroupRelation record);

    int updateByPrimaryKey(UserGroupRelation record);
}