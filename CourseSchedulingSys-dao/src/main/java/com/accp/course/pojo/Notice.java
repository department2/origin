package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy
 * 公告类
 */
public class Notice {

	private Integer id;    //公告编号
	private String title;    //标题
	private String content;    //内容
	private Date startTime;    //公告开始时间
	private Date endTime;    //公告结束时间
	private Integer typeId;    //类型编号
	private Integer state;    //状态
	private String creator;    //发布人

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Notice() {
		super();
	}

	public Notice(Integer id, String title, String content, Date startTime, Date endTime, Integer typeId, Integer state,
			String creator) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.startTime = startTime;
		this.endTime = endTime;
		this.typeId = typeId;
		this.state = state;
		this.creator = creator;
	}

}
