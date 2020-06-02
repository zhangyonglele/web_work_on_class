package com.work.web_work_on_class.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * project_group
 * @author 
 */
@Data
public class ProjectGroup implements Serializable {
    private Integer groupId;

    private String groupName;

    private Date groupBeginDate;

    private Date groupEndDate;

    private Integer groupCanBeSearch;

    private Integer groupCreater;

    private String groupIntroduction;

    private Integer groupStatus;

    private static final long serialVersionUID = 1L;
    
    public ProjectGroup(String groupName, Date groupBeginDate, Date groupEndDate, Integer groupCanBeSearch, Integer groupCreater, String groupIntroduction) {
    	this.groupName = groupName;
    	this.groupBeginDate = groupBeginDate;
    	this.groupEndDate = groupEndDate;
    	this.groupCanBeSearch = groupCanBeSearch;
    	this.groupCreater = groupCreater;
    	this.groupIntroduction = groupIntroduction;
    	this.groupStatus = 0;
    }

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getGroupBeginDate() {
		return groupBeginDate;
	}

	public void setGroupBeginDate(Date groupBeginDate) {
		this.groupBeginDate = groupBeginDate;
	}

	public Date getGroupEndDate() {
		return groupEndDate;
	}

	public void setGroupEndDate(Date groupEndDate) {
		this.groupEndDate = groupEndDate;
	}

	public Integer getGroupCanBeSearch() {
		return groupCanBeSearch;
	}

	public void setGroupCanBeSearch(Integer groupCanBeSearch) {
		this.groupCanBeSearch = groupCanBeSearch;
	}

	public Integer getGroupCreater() {
		return groupCreater;
	}

	public void setGroupCreater(Integer groupCreater) {
		this.groupCreater = groupCreater;
	}

	public String getGroupIntroduction() {
		return groupIntroduction;
	}

	public void setGroupIntroduction(String groupIntroduction) {
		this.groupIntroduction = groupIntroduction;
	}

	public Integer getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(Integer groupStatus) {
		this.groupStatus = groupStatus;
	}
    
}