package com.work.web_work_on_class.service;

import com.work.web_work_on_class.dto.GroupMember;

import java.util.List;

public interface GroupMemberService {
    List<GroupMember> getGroupMember(int groupId);
}
