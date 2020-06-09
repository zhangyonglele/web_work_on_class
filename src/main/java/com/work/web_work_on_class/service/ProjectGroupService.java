package com.work.web_work_on_class.service;

import com.work.web_work_on_class.model.ProjectGroup;

import java.util.List;

public interface ProjectGroupService {
	
    Integer addNewGroup(ProjectGroup record);

    ProjectGroup getGroupInfo(int groupId);

    List<ProjectGroup> getGroupByCreatorId(int creatorId);

    boolean checkICreateGroupOrNot(int groupId,int userId);
}
