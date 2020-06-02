package com.work.web_work_on_class.model;

import java.io.Serializable;
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

    private static final long serialVersionUID = 1L;
}