package com.accp.course.pojo;

/**
 * @author wy
 * 年级类
 */
public class Period {

	private Integer id; // 年级编号
	private String name; // 年级名称
	private Integer state; // 状态

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

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Period() {
		super();
	}

	public Period(Integer id, String name, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}

}
