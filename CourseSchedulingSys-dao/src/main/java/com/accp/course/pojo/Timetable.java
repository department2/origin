package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy 课表详情类
 */
public class Timetable {

	private Integer id;    //编号
	private String classNameAM;    //上午班级名称
	private String classIdAM;    //上午班级编号
	private String teacherIdAM;    //上午教师名称
	private Integer courseIdAM;    //上午课程编号
	private Integer courseCountAM;    //上午课时数
	private String courseNameAM;     //上午课程名称
	private Integer classRoomIdAM;    //上午教室编号
	private String classNamePM;    //下午班级名称
	private String classIdPM;    //下午班级编号
	private String teacherIdPM;    //下午教师编号
	private Integer courseIdPM;     //下午课程编号
	private Integer courseCountPM;     //下午课时数
	private String courseNamePM;     //下午课程名称
	private Integer classRoomIdPM;     //下午教师编号
	private Date date;     //课表日期
	private Integer state;    //状态
	private String week;    //星期几

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassNameAM() {
		return classNameAM;
	}

	public void setClassNameAM(String classNameAM) {
		this.classNameAM = classNameAM;
	}

	public String getClassIdAM() {
		return classIdAM;
	}

	public void setClassIdAM(String classIdAM) {
		this.classIdAM = classIdAM;
	}

	public String getTeacherIdAM() {
		return teacherIdAM;
	}

	public void setTeacherIdAM(String teacherIdAM) {
		this.teacherIdAM = teacherIdAM;
	}

	public Integer getCourseIdAM() {
		return courseIdAM;
	}

	public void setCourseIdAM(Integer courseIdAM) {
		this.courseIdAM = courseIdAM;
	}

	public Integer getCourseCountAM() {
		return courseCountAM;
	}

	public void setCourseCountAM(Integer courseCountAM) {
		this.courseCountAM = courseCountAM;
	}

	public String getCourseNameAM() {
		return courseNameAM;
	}

	public void setCourseNameAM(String courseNameAM) {
		this.courseNameAM = courseNameAM;
	}

	public Integer getClassRoomIdAM() {
		return classRoomIdAM;
	}

	public void setClassRoomIdAM(Integer classRoomIdAM) {
		this.classRoomIdAM = classRoomIdAM;
	}

	public String getClassNamePM() {
		return classNamePM;
	}

	public void setClassNamePM(String classNamePM) {
		this.classNamePM = classNamePM;
	}

	public String getClassIdPM() {
		return classIdPM;
	}

	public void setClassIdPM(String classIdPM) {
		this.classIdPM = classIdPM;
	}

	public String getTeacherIdPM() {
		return teacherIdPM;
	}

	public void setTeacherIdPM(String teacherIdPM) {
		this.teacherIdPM = teacherIdPM;
	}

	public Integer getCourseIdPM() {
		return courseIdPM;
	}

	public void setCourseIdPM(Integer courseIdPM) {
		this.courseIdPM = courseIdPM;
	}

	public Integer getCourseCountPM() {
		return courseCountPM;
	}

	public void setCourseCountPM(Integer courseCountPM) {
		this.courseCountPM = courseCountPM;
	}

	public String getCourseNamePM() {
		return courseNamePM;
	}

	public void setCourseNamePM(String courseNamePM) {
		this.courseNamePM = courseNamePM;
	}

	public Integer getClassRoomIdPM() {
		return classRoomIdPM;
	}

	public void setClassRoomIdPM(Integer classRoomIdPM) {
		this.classRoomIdPM = classRoomIdPM;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public Timetable() {
		super();
	}

	public Timetable(Integer id, String classNameAM, String classIdAM, String teacherIdAM, Integer courseIdAM,
			Integer courseCountAM, String courseNameAM, Integer classRoomIdAM, String classNamePM, String classIdPM,
			String teacherIdPM, Integer courseIdPM, Integer courseCountPM, String courseNamePM, Integer classRoomIdPM,
			Date date, Integer state, String week) {
		super();
		this.id = id;
		this.classNameAM = classNameAM;
		this.classIdAM = classIdAM;
		this.teacherIdAM = teacherIdAM;
		this.courseIdAM = courseIdAM;
		this.courseCountAM = courseCountAM;
		this.courseNameAM = courseNameAM;
		this.classRoomIdAM = classRoomIdAM;
		this.classNamePM = classNamePM;
		this.classIdPM = classIdPM;
		this.teacherIdPM = teacherIdPM;
		this.courseIdPM = courseIdPM;
		this.courseCountPM = courseCountPM;
		this.courseNamePM = courseNamePM;
		this.classRoomIdPM = classRoomIdPM;
		this.date = date;
		this.state = state;
		this.week = week;
	}

}
