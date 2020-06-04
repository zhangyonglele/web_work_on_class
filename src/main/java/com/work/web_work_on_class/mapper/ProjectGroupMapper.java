package com.work.web_work_on_class.mapper;

import com.work.web_work_on_class.model.ProjectGroup;

import java.util.List;

/**
 * 这个Mapper有找不到的问题，避免接下来用这个开发把
 */
public interface ProjectGroupMapper {
    int deleteByPrimaryKey(Integer groupId);

    int insert(ProjectGroup record);

    int insertSelective(ProjectGroup record);

    ProjectGroup selectByPrimaryKey(Integer groupId);

    List<ProjectGroup> selectGroupByCreator(Integer creatorId);

    int updateByPrimaryKeySelective(ProjectGroup record);

    int updateByPrimaryKey(ProjectGroup record);
}