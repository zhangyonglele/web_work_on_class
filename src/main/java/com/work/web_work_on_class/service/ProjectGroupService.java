package com.work.web_work_on_class.service;

import com.work.web_work_on_class.model.ProjectGroup;

public interface ProjectGroupService {
    boolean addNewGroup(ProjectGroup record);

    ProjectGroup getGroupInfo(int groupId);
}
