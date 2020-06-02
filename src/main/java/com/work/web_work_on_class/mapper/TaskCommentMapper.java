package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.model.TaskComment;

public interface TaskCommentMapper {
    int deleteByPrimaryKey(Integer commentId);

    int insert(TaskComment record);

    int insertSelective(TaskComment record);

    TaskComment selectByPrimaryKey(Integer commentId);

    int updateByPrimaryKeySelective(TaskComment record);

    int updateByPrimaryKey(TaskComment record);
}