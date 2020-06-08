package com.work.web_work_on_class.service;

import com.work.web_work_on_class.dto.GroupIJoin;

import java.util.List;
import java.util.Map;

public interface GroupIJoinService {
    List<GroupIJoin> getGroupIJoin(int userId);

    boolean checkIJoinTheGroupOrNot(Map<String,Object> params);
}
