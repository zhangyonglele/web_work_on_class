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

    public UserGroupRelation(Integer userId, Integer groupId, String nickyName, Date joinTime) {
    	this.userId = userId;
    	this.groupId = groupId;
    	this.nickyName = nickyName;
    	this.joinTime = joinTime;
    }
    
	public Integer getRelationId() {
		return relationId;
	}

	public void setRelationId(Integer relationId) {
		this.relationId = relationId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getNickyName() {
		return nickyName;
	}

	public void setNickyName(String nickyName) {
		this.nickyName = nickyName;
	}

	public Date getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
    
}