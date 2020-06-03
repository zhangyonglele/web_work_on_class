package com.work.web_work_on_class.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * tasks
 * @author 
 */
@Data
public class Tasks implements Serializable {
    private Integer taskId;

    private Integer taskBelong;

    private Integer taskTakenStatus;

    private Integer taskTaker;

    private String taskName;

    private String taskRequest;
    
    private Date taskDeadline;

    private static final long serialVersionUID = 1L;

    public Tasks(Integer taskBelong, Integer taskTaker, String taskName, String taskRequest, Date taskDeadline) {
    	this.taskBelong = taskBelong;
    	this.taskTakenStatus = 0;
    	this.taskTaker = taskTaker;
    	this.taskName = taskName;
    	this.taskRequest = taskRequest;
    	this.taskDeadline = taskDeadline;
    }
    
	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getTaskBelong() {
		return taskBelong;
	}

	public void setTaskBelong(Integer taskBelong) {
		this.taskBelong = taskBelong;
	}

	public Integer getTaskTakenStatus() {
		return taskTakenStatus;
	}

	public void setTaskTakenStatus(Integer taskTakenStatus) {
		this.taskTakenStatus = taskTakenStatus;
	}

	public Integer getTaskTaker() {
		return taskTaker;
	}

	public void setTaskTaker(Integer taskTaker) {
		this.taskTaker = taskTaker;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskRequest() {
		return taskRequest;
	}

	public void setTaskRequest(String taskRequest) {
		this.taskRequest = taskRequest;
	}

	public Date getTaskDeadline() {
		return taskDeadline;
	}

	public void setTaskDeadline(Date taskDeadline) {
		this.taskDeadline = taskDeadline;
	}
    
}