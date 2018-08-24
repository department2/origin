package com.accp.course.pojo;

/**
 * @author wy
 * 教师课程类
 */
public class TeacherAndCourse {
 
	private Integer id;    //编号
	private String teacherId;    //教师编号
	private Integer courseId;    //课程编号
	private Integer state;    //状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public TeacherAndCourse() {
		super();
	}

	public TeacherAndCourse(Integer id, String teacherId, Integer courseId, Integer state) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.courseId = courseId;
		this.state = state;
	}

}
