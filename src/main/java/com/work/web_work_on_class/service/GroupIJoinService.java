package com.work.web_work_on_class.service;

import com.work.web_work_on_class.dto.GroupIJoin;

import java.util.List;

public interface GroupIJoinService {
    List<GroupIJoin> getGroupIJoin(int userId);
}
