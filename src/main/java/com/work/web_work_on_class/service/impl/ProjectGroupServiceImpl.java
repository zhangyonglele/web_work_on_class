package com.work.web_work_on_class.service.impl;

import com.work.web_work_on_class.mapper.ProjectGroupMapper;
import com.work.web_work_on_class.mapper.ProjectGroupMapperTest;
import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.service.ProjectGroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectGroupServiceImpl implements ProjectGroupService {
    
	@Resource
	private ProjectGroupMapper projectGroupMapper;

	@Resource
	private ProjectGroupMapperTest projectGroupMapperTest;
	
	@Override
    public boolean addNewGroup(ProjectGroup record) {
		try {
			projectGroupMapper.insert(record);
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		}
    }

    @Override
    public ProjectGroup getGroupInfo(int groupId) {
        return projectGroupMapper.selectByPrimaryKey(groupId);
    }

	@Override
	public List<ProjectGroup> getGroupByCreatorId(int creatorId) {
		return projectGroupMapperTest.selectGroupByCreator(creatorId);
	}
}
