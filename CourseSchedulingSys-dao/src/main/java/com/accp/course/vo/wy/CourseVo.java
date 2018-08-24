package com.accp.course.vo.wy;

public class CourseVo {
	
	private Integer zid;    //课程编号
	private Integer id;     //无用字段
	private Integer id2;    //无用字段
	private Integer periodId;    //年级编号
	private String periodName;   //年级名称
	private String name;     //课程编号
	private String simpleName;    //课程简称
	private Integer parentId;    //父级编号
	private String parentName;   //父级名称
	private Integer courseCount;    //课时数
	private Integer state;    //状态

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public Integer getZid() {
		return zid;
	}

	public void setZid(Integer zid) {
		this.zid = zid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId2() {
		return id2;
	}

	public void setId2(Integer id2) {
		this.id2 = id2;
	}

	public Integer getPeriodId() {
		return periodId;
	}

	public void setPeriodId(Integer periodId) {
		this.periodId = periodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSimpleName() {
		return simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(Integer courseCount) {
		this.courseCount = courseCount;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public CourseVo() {
		super();
	}

	public CourseVo(Integer zid, Integer id, Integer id2, Integer periodId, String name, String simpleName,
			Integer parentId, Integer courseCount, Integer state) {
		super();
		this.zid = zid;
		this.id = id;
		this.id2 = id2;
		this.periodId = periodId;
		this.name = name;
		this.simpleName = simpleName;
		this.parentId = parentId;
		this.courseCount = courseCount;
		this.state = state;
	}
	
}
