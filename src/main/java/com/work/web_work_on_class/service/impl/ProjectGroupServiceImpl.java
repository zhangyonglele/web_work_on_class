package com.work.web_work_on_class.service.impl;

import com.work.web_work_on_class.mapper.ProjectGroupMapper;
import com.work.web_work_on_class.mapper.ProjectGroupMapperTest;
import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.model.ProjectGroupTest;
import com.work.web_work_on_class.service.ProjectGroupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProjectGroupServiceImpl implements ProjectGroupService {
    
	@Resource
	private ProjectGroupMapper projectGroupMapper;

	@Resource
	private ProjectGroupMapperTest projectGroupMapperTest;
	
	@Override
    public Integer addNewGroup(ProjectGroup record) {
		Integer index = null;
		try {
			index = projectGroupMapper.insert(record);
		} catch (Exception e){
			e.printStackTrace();
			index = -1;
		}
		return index;
    }

    @Override
    public ProjectGroup getGroupInfo(int groupId) {
        return projectGroupMapper.selectByPrimaryKey(groupId);
    }

	@Override
	public List<ProjectGroup> getGroupByCreatorId(int creatorId) {
		return projectGroupMapperTest.selectGroupByCreator(creatorId);
	}

	@Override
	public boolean checkICreateGroupOrNot(int groupId, int userId) {
		Map<String,Object> params = new HashMap<>();
		params.put("groupId",groupId);
		params.put("userId",userId);
 		ProjectGroupTest group = projectGroupMapperTest.checkICreateThisGroupOrNot(params);
 		if(group != null && !group.getGroupId().equals("")){
 			return true;
		}
		return false;
	}
}
