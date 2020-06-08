package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.dto.GroupIJoin;

import java.util.List;
import java.util.Map;

public interface GroupIJoinMapper {
    List<GroupIJoin> selectGroupIJoin(int userId);

    /**
     *
     * @param params 内含UserId,GroupID，用于检测用户权限越界与否
     * @return
     */
    GroupIJoin checkTheGroupIJoinOrNot(Map<String,Object> params);

    int insert(GroupIJoin record);

    int insertSelective(GroupIJoin record);
}