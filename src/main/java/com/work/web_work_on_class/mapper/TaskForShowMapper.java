package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.dto.TaskForShow;

import java.util.List;
import java.util.Map;

public interface TaskForShowMapper {
    List<TaskForShow> selectByGroupId(int groupId);


    List<TaskForShow> selectMyWaitingForTakeTask(Map<String,Object> params);
    List<TaskForShow> selectMyIncompleteTask(Map<String,Object> params);
    List<TaskForShow> selectMyFinishedTask(Map<String,Object> params);
}