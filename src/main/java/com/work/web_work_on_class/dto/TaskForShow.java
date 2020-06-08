package com.work.web_work_on_class.dto;

import java.io.Serializable;
import java.util.Date;
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

    private Date taskDeadline;

    private Integer taskTakenStatus;

    private Integer taskTaker;

    private static final long serialVersionUID = 1L;
}