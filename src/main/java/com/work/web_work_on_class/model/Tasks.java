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
}