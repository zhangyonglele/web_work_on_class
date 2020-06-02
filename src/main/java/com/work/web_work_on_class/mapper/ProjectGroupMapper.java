package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.model.ProjectGroup;

public interface ProjectGroupMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(ProjectGroup record);

    int insertSelective(ProjectGroup record);

    ProjectGroup selectByPrimaryKey(Integer groupId);

    int updateByPrimaryKeySelective(ProjectGroup record);

    int updateByPrimaryKey(ProjectGroup record);
}