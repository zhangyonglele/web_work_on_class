package com.work.web_work_on_class.service.impl;

import com.work.web_work_on_class.dto.GroupIJoin;
import com.work.web_work_on_class.mapper.GroupIJoinMapper;
import com.work.web_work_on_class.service.GroupIJoinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GroupIJoinServiceImpl implements GroupIJoinService {
    @Resource
    private GroupIJoinMapper groupIJoinMapper;
    @Override
    public List<GroupIJoin> getGroupIJoin(int userId) {
        return groupIJoinMapper.selectGroupIJoin(userId);
    }
}
