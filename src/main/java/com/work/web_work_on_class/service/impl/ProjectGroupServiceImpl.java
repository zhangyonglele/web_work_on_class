package com.work.web_work_on_class.service.impl;

import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.service.ProjectGroupService;
import org.springframework.stereotype.Service;

@Service
public class ProjectGroupServiceImpl implements ProjectGroupService {
    @Override
    public boolean addNewGroup(ProjectGroup record) {
        return false;
    }

    @Override
    public ProjectGroup getGroupInfo(int groupId) {
        return null;
    }
}
