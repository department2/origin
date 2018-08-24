package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy 角色编号
 */
public class Role {

	private Integer id;    //角色编号
	private String name;    //角色名称
	private String description;    //描述
	private Date createTime;    //创建时间
	private Integer state;    //状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Role() {
		super();
	}

	public Role(Integer id, String name, String description, Date createTime, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.createTime = createTime;
		this.state = state;
	}

}
