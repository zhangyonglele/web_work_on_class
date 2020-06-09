package com.work.web_work_on_class.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * project_group
 * @author 
 */
@Data
public class ProjectGroupTest implements Serializable {
    private Integer groupId;

    private String groupName;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date groupBeginDate;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date groupEndDate;

    private Integer groupCanBeSearch;

    private Integer groupCreator;

    private String groupIntroduction;

    private Integer groupStatus;

    private static final long serialVersionUID = 999934567L;
}