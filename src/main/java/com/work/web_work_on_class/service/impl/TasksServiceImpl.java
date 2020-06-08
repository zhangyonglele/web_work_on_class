package com.work.web_work_on_class.service.impl;

import javax.annotation.Resource;

import com.work.web_work_on_class.dto.TaskForShow;
import com.work.web_work_on_class.mapper.TaskForShowMapper;
import org.springframework.stereotype.Service;

import com.work.web_work_on_class.mapper.TasksMapper;
import com.work.web_work_on_class.model.Tasks;
import com.work.web_work_on_class.service.TasksService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TasksServiceImpl implements TasksService{



	@Resource
	private TasksMapper tasksMapper;

	@Resource
	private TaskForShowMapper taskForShowMapper;
	
	@Override
	public boolean addTasks(Tasks record) {
		try {
			tasksMapper.insert(record);
			return true;
		} catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<TaskForShow> getTaskMsgByGroupId(int groupId) {
		return taskForShowMapper.selectByGroupId(groupId);
	}

	@Override
	public Tasks getTask(int taskId) {
		return tasksMapper.selectByPrimaryKey(taskId);
	}

	@Override
	public boolean updateTaskStatus(Tasks tasks,int taskStatus) {
		boolean flag = false;
		try{
			tasks.setTaskTakenStatus(taskStatus);
			tasksMapper.updateByPrimaryKey(tasks);
			flag = true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<TaskForShow> getMyWaitingForTakeTask(int userId,int groupId) {
		Map<String,Object> params = new HashMap<>();
		params.put("userId",userId);
		params.put("groupId",groupId);
		return taskForShowMapper.selectMyWaitingForTakeTask(params);
	}

	@Override
	public List<TaskForShow> getMyFinishTask(int userId,int groupId) {
		Map<String,Object> params = new HashMap<>();
		params.put("userId",userId);
		params.put("groupId",groupId);
		return taskForShowMapper.selectMyFinishedTask(params);
	}

	@Override
	public List<TaskForShow> getMyIncompleteTask(int userId,int groupId) {
		Map<String,Object> params = new HashMap<>();
		params.put("userId",userId);
		params.put("groupId",groupId);
		return taskForShowMapper.selectMyIncompleteTask(params);
	}
}
