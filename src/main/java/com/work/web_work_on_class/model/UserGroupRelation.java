package com.work.web_work_on_class.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user_group_relation
 * @author 
 */
@Data
public class UserGroupRelation implements Serializable {
    private Integer relationId;

    private Integer userId;

    private Integer groupId;

    private String nickyName;

    private Date joinTime;

    private static final long serialVersionUID = 1L;
}