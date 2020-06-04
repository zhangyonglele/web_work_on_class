package com.work.web_work_on_class.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * group_member
 * @author 
 */
@Data
public class GroupMember implements Serializable {
    private Integer relationId;

    private Integer groupId;

    private Date joinTime;

    private String userNickName;

    private String userEmail;

    private Integer userId;

    private static final long serialVersionUID = 1L;
}