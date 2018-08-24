package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy
 * 消息类
 */
public class Message {

	private Integer id;    //消息编号
	private String userId;    //接受用户编号
	private Integer state;    //状态
	private String content;    //内容
	private Date date;    //发送日期
	private Integer type;    //类型

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Message() {
		super();
	}

	public Message(Integer id, String userId, Integer state, String content, Date date, Integer type) {
		super();
		this.id = id;
		this.userId = userId;
		this.state = state;
		this.content = content;
		this.date = date;
		this.type = type;
	}

}
