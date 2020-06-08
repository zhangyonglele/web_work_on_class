package com.work.web_work_on_class.service;

import com.work.web_work_on_class.dto.TaskForShow;
import com.work.web_work_on_class.model.Tasks;

import java.util.List;

public interface TasksService {

	int WAITING_FOR_TAKEN = 0;

	int HAVE_BEING_TAKEN = 1;

	int HAVE_BEING_FINISH = 2;

	int CROSS_DEADLINE_FINISH = 3;

	boolean addTasks(Tasks record);

	List<TaskForShow> getTaskMsgByGroupId(int groupId);

	Tasks getTask(int taskId);

	boolean updateTaskStatus(Tasks tasks,int taskStatus);

	List<TaskForShow> getMyWaitingForTakeTask(int userId,int groupId);

	List<TaskForShow> getMyFinishTask(int userId,int groupId);

	List<TaskForShow> getMyIncompleteTask(int userId,int groupId);
	
}
