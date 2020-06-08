package com.work.web_work_on_class.controller;

import com.work.web_work_on_class.dto.TaskForShow;
import com.work.web_work_on_class.filter.annotation.GroupAuthRequire;
import com.work.web_work_on_class.filter.annotation.LoginRequire;
import com.work.web_work_on_class.model.Tasks;
import com.work.web_work_on_class.model.User;
import com.work.web_work_on_class.service.TasksService;
import com.work.web_work_on_class.util.UniversalResponseBody;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@CrossOrigin(allowCredentials = "true",origins = {"http://localhost:8080","*"})
public class TaskInfoController {

    @Resource
    private TasksService tasksService;

    @GetMapping("/group/task")
    @LoginRequire("user")
    @GroupAuthRequire
    public UniversalResponseBody getTaskByGroupId(@RequestParam("groupId")int groupId){
        return new UniversalResponseBody(0,"success",tasksService.getTaskMsgByGroupId(groupId));
    }

    @GetMapping("/group/task/incomplete/me")
    @LoginRequire("user")
    @GroupAuthRequire
    public UniversalResponseBody getMyIncompleteTask(HttpSession session,@RequestParam("groupId")int groupId){
        int userId = ((User)session.getAttribute("userInfo")).getUserId();
        return new UniversalResponseBody(0,"success",tasksService.getMyIncompleteTask(userId,groupId));
    }

    @GetMapping("/group/task/taken/me")
    @LoginRequire("user")
    @GroupAuthRequire
    public UniversalResponseBody getMyWaitingForTakenTask(HttpSession session,@RequestParam("groupId")int groupId){
        int userId = ((User)session.getAttribute("userInfo")).getUserId();
        return new UniversalResponseBody(0,"success",tasksService.getMyWaitingForTakeTask(userId,groupId));
    }

    @GetMapping("/group/task/finished/me")
    @LoginRequire("user")
    @GroupAuthRequire
    public UniversalResponseBody getMyFinishTask(HttpSession session,@RequestParam("groupId")int groupId){
        int userId = ((User)session.getAttribute("userInfo")).getUserId();
        return new UniversalResponseBody(0,"success",tasksService.getMyFinishTask(userId,groupId));
    }

    @PutMapping("/group/task/confirm")
    @LoginRequire("user")
    @GroupAuthRequire
    public UniversalResponseBody takeTask(HttpSession session,@RequestParam("taskId")int taskId){
        User user = (User)session.getAttribute("userInfo");
        Tasks thisTask = tasksService.getTask(taskId);
        if(tasksService.updateTaskStatus(thisTask,TasksService.HAVE_BEING_TAKEN)){
            return new UniversalResponseBody(0,"success");
        }else{
            return new UniversalResponseBody(-1,"error");
        }
    }

    @PutMapping("/group/task/finish")
    @LoginRequire("user")
    @GroupAuthRequire
    public UniversalResponseBody finishTask(HttpSession session,@RequestParam("taskId")int taskId){
        User user = (User)session.getAttribute("userInfo");
        Tasks thisTask = tasksService.getTask(taskId);
        int updateStatus = 1;
        Date now = new Date();
        if(thisTask.getTaskDeadline().before(now)){
            updateStatus = TasksService.CROSS_DEADLINE_FINISH;
        }else{
            updateStatus = TasksService.HAVE_BEING_FINISH;
        }
        if(tasksService.updateTaskStatus(thisTask,updateStatus)){
            return new UniversalResponseBody(0,"success");
        }else{
            return new UniversalResponseBody(-1,"error");
        }
    }


}
