package com.work.web_work_on_class.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * group_i_join
 * @author 
 */
@Data
public class GroupIJoin implements Serializable {
    private Integer userId;

    private Integer groupId;

    private String groupName;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date groupBeginDate;
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date groupEndDate;

    private Integer groupCreator;

    private Integer groupCanBeSearch;

    private String groupIntroduction;

    private static final long serialVersionUID = 1L;
}