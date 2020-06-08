package com.work.web_work_on_class.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.work.web_work_on_class.filter.annotation.GroupAuthRequire;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:8080","*"})
public class CreateTasksController {

	@Resource
	TasksService tasksService;
	
	@PostMapping("/Tasks/new")
	@LoginRequire("user")
	@GroupAuthRequire
	public UniversalResponseBody register(@RequestParam("taskName")String taskName,
										  @RequestParam("taskTaker")int taskTaker,
            							  @RequestParam("groupId")int taskBelong,
            							  @RequestParam("taskRequest")String taskRequest,
            							  @RequestParam("taskDeadline")String taskDeadline,
            							  HttpSession session){
		Date taskDeadline1 = String2DateUtils.parseDateStr(taskDeadline);
		//假设前端传来的数据是负责人id
		Tasks record = new Tasks(taskBelong, taskTaker, taskName, taskRequest, taskDeadline1);
		if(tasksService.addTasks(record)){
			return new UniversalResponseBody(0,"success");
		}else{
			return new UniversalResponseBody(-1,"error");
		}
	}
	
}
