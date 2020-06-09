package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.model.Tasks;

public interface TasksTestMapper {
    int deleteByPrimaryKey(Integer taskId);

    int insert(Tasks record);

    int insertSelective(Tasks record);

    Tasks selectByPrimaryKey(Integer taskId);

    int updateByPrimaryKeySelective(Tasks record);

    int updateByPrimaryKey(Tasks record);
}