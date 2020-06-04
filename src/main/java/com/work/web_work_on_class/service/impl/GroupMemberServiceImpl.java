package com.work.web_work_on_class.service.impl;

import com.work.web_work_on_class.dto.GroupMember;
import com.work.web_work_on_class.mapper.GroupMemberMapper;
import com.work.web_work_on_class.service.GroupMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GroupMemberServiceImpl implements GroupMemberService {
    @Resource
    private GroupMemberMapper groupMemberMapper;

    @Override
    public List<GroupMember> getGroupMember(int groupId) {
        return groupMemberMapper.selectMyGroupMember(groupId);
    }
}
