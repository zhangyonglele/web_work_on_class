package com.work.web_work_on_class.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.work.web_work_on_class.filter.annotation.LoginRequire;
import com.work.web_work_on_class.model.ProjectGroup;
import com.work.web_work_on_class.model.Tasks;
import com.work.web_work_on_class.service.TasksService;
import com.work.web_work_on_class.util.String2DateUtils;
import com.work.web_work_on_class.util.UniversalResponseBody;

@RestController
public class CreateTasksController {

	@Resource
	TasksService tasksService;
	
	@PostMapping("/Tasks/new")
	@LoginRequire("user")
	public UniversalResponseBody register(@RequestParam("taskName")String taskName,
										  @RequestParam("taskTaker")String taskTaker,
            							  @RequestParam("taskRequest")String taskRequest,
            							  @RequestParam("taskDeadline")String taskDeadline,
            							  HttpSession session){
		Date taskDeadline1 = String2DateUtils.parseDateStr(taskDeadline);
		//假设前端传来的数据是负责人id
		Integer taskTaker1 = Integer.valueOf(taskTaker);
		//假设session中储存了项目信息
		Integer taskBelong = ((ProjectGroup) (session.getAttribute("ProjectGroupInfo"))).getGroupId();
		Tasks record = new Tasks(taskBelong, taskTaker1, taskName, taskRequest, taskDeadline1);
		if(tasksService.addTasks(record)){
			return new UniversalResponseBody(0,"success");
		}else{
			return new UniversalResponseBody(-1,"error");
		}
	}
	
}
