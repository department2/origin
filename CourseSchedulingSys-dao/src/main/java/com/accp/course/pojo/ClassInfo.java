package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy 班级信息类，对应数据库class表
 */
public class ClassInfo {

	private String id;    //班级编号
	private String name;    //班级名称 
	private Integer studentsCount;    //学生数
	private Integer periodId;    //年级编号
	private String classTeacherId;    //班主任编号
	private String teacherId;    //教员编号
	private Date openDate;    //开班日期
	private Integer courseCount;    //课时数
	private Integer classRoomId;    //教室编号。无用字段   
	private Integer state;    //状态
	private Integer courseId;    //课程编号
	private Integer prior;    //优先级

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStudentsCount() {
		return studentsCount;
	}

	public void setStudentsCount(Integer studentsCount) {
		this.studentsCount = studentsCount;
	}

	public Integer getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

	public String getClassTeacherId() {
		return classTeacherId;
	}

	public void setClassTeacherId(String classTeacherId) {
		this.classTeacherId = classTeacherId;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Integer getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(Integer courseCount) {
		this.courseCount = courseCount;
	}

	public Integer getClassRoomId() {
		return classRoomId;
	}

	public void setClassRoomId(Integer classRoomId) {
		this.classRoomId = classRoomId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getPrior() {
		return prior;
	}

	public void setPrior(Integer prior) {
		this.prior = prior;
	}

	public ClassInfo() {
		super();
	}

	public ClassInfo(String id, String name, Integer studentsCount, Integer periodId, String classTeacherId,
			String teacherId, Date openDate, Integer courseCount, Integer classRoomId, Integer state, Integer courseId,
			Integer prior) {
		super();
		this.id = id;
		this.name = name;
		this.studentsCount = studentsCount;
		this.periodId = periodId;
		this.classTeacherId = classTeacherId;
		this.teacherId = teacherId;
		this.openDate = openDate;
		this.courseCount = courseCount;
		this.classRoomId = classRoomId;
		this.state = state;
		this.courseId = courseId;
		this.prior = prior;
	}

}
