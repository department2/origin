package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy
 * 
 */
public class ClassAndCourse {

	private Integer id;
	private Integer classId;
	private Integer courseId;
	private Date upDate;
	private String upUserId;
	private String content;
	private Integer state;
	private Integer type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Date getUpDate() {
		return upDate;
	}

	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}

	public String getUpUserId() {
		return upUserId;
	}

	public void setUpUserId(String upUserId) {
		this.upUserId = upUserId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public ClassAndCourse() {
		super();
	}

	public ClassAndCourse(Integer id, Integer classId, Integer courseId, Date upDate, String upUserId, String content,
			Integer state, Integer type) {
		super();
		this.id = id;
		this.classId = classId;
		this.courseId = courseId;
		this.upDate = upDate;
		this.upUserId = upUserId;
		this.content = content;
		this.state = state;
		this.type = type;
	}

}
