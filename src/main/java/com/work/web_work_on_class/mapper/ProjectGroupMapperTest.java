package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.model.ProjectGroupTest;

import java.util.List;

public interface ProjectGroupMapperTest {
    int deleteByPrimaryKey(Integer groupId);

    int insert(ProjectGroupTest record);

    int insertSelective(ProjectGroupTest record);

    List<ProjectGroup> selectGroupByCreator(Integer creatorId);

    ProjectGroupTest selectByPrimaryKey(Integer groupId);

    int updateByPrimaryKeySelective(ProjectGroupTest record);

    int updateByPrimaryKey(ProjectGroupTest record);
}