package com.accp.course.pojo;

/**
 * @author wy
 * 公告类型
 */
public class NoticeType {

	private Integer id;    //公告类型编号
	private String name;    //类型名称
	private Integer state;   //状态

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

	public NoticeType() {
		super();
	}

	public NoticeType(Integer id, String name, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
	}

}
