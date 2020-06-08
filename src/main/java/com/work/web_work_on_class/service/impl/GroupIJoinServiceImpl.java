package com.work.web_work_on_class.service.impl;

import com.work.web_work_on_class.dto.GroupIJoin;
import com.work.web_work_on_class.mapper.GroupIJoinMapper;
import com.work.web_work_on_class.service.GroupIJoinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GroupIJoinServiceImpl implements GroupIJoinService {
    @Resource
    private GroupIJoinMapper groupIJoinMapper;
    @Override
    public List<GroupIJoin> getGroupIJoin(int userId) {
        return groupIJoinMapper.selectGroupIJoin(userId);
    }

    @Override
    public boolean checkIJoinTheGroupOrNot(Map<String, Object> params) {
        GroupIJoin ret = groupIJoinMapper.checkTheGroupIJoinOrNot(params);
        if(ret != null && !ret.getGroupName().equals("")){
            return true;
        }else {
            return false;
        }
    }
}
