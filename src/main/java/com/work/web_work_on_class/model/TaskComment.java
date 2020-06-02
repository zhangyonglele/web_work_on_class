package com.work.web_work_on_class.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * task_comment
 * @author 
 */
@Data
public class TaskComment implements Serializable {
    private Integer commentId;

    private Integer commentFor;

    private Integer commentFrom;

    private String commentContain;

    private Date commentDate;

    private static final long serialVersionUID = 1L;
}