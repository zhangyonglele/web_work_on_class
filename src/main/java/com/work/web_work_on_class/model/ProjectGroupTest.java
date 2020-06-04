package com.work.web_work_on_class.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * project_group
 * @author 
 */
@Data
public class ProjectGroupTest implements Serializable {
    private Integer groupId;

    private String groupName;

    private Date groupBeginDate;

    private Date groupEndDate;

    private Integer groupCanBeSearch;

    private Integer groupCreator;

    private String groupIntroduction;

    private Integer groupStatus;

    private static final long serialVersionUID = 1L;
}