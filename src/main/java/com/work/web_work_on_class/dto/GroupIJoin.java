package com.work.web_work_on_class.dto;

import java.io.Serializable;
import java.util.Date;
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

    private Date groupBeginDate;

    private Date groupEndDate;

    private Integer groupCreator;

    private Integer groupCanBeSearch;

    private String groupIntroduction;

    private static final long serialVersionUID = 1L;
}