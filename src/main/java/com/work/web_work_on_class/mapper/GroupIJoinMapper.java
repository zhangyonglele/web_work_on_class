package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.dto.GroupIJoin;

import java.util.List;

public interface GroupIJoinMapper {
    List<GroupIJoin> selectGroupIJoin(int userId);

    int insert(GroupIJoin record);

    int insertSelective(GroupIJoin record);
}