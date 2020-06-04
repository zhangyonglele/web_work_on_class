package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.dto.GroupMember;

import java.util.List;

public interface GroupMemberMapper {
    List<GroupMember> selectMyGroupMember(int groupId);
    int insert(GroupMember record);

    int insertSelective(GroupMember record);
}