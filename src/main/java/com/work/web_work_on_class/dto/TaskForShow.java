package com.work.web_work_on_class.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * task_for_show
 * @author 
 */
@Data
public class TaskForShow implements Serializable {
    private String taskName;

    private Integer taskBelong;

    private String userNickName;

    private String userEmail;

    private String taskRequest;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date taskDeadline;

    private Integer taskTakenStatus;

    private Integer taskTaker;

    private Integer taskId;

    private static final long serialVersionUID = 1L;
}