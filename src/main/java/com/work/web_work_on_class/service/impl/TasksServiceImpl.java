package com.work.web_work_on_class.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.work.web_work_on_class.mapper.TasksMapper;
import com.work.web_work_on_class.model.Tasks;
import com.work.web_work_on_class.service.TasksService;

@Service
public class TasksServiceImpl implements TasksService{

	@Resource
	private TasksMapper tasksMapper;
	
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
	
}
