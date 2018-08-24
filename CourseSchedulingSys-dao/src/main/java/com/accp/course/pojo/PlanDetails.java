package com.accp.course.pojo;

/**
 * @author wy 排课计划详情类
 */
public class PlanDetails {

	private Integer id;    //详情编号
	private String planId;    //排课主表编号
	private String classOrTeacherId;    //班级或教员编号
	private String name;    //班级或教员名称
	private String noTime;    //无课时间
	private Integer classFrequency;    //排课次数
	private Integer type;    //类型
	private Integer state;   //状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getClassOrTeacherId() {
		return classOrTeacherId;
	}

	public void setClassOrTeacherId(String classOrTeacherId) {
		this.classOrTeacherId = classOrTeacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNoTime() {
		return noTime;
	}

	public void setNoTime(String noTime) {
		this.noTime = noTime;
	}

	public Integer getClassFrequency() {
		return classFrequency;
	}

	public void setClassFrequency(Integer classFrequency) {
		this.classFrequency = classFrequency;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public PlanDetails() {
		super();
	}

	public PlanDetails(Integer id, String planId, String classOrTeacherId, String name, String noTime,
			Integer classFrequency, Integer type, Integer state) {
		super();
		this.id = id;
		this.planId = planId;
		this.classOrTeacherId = classOrTeacherId;
		this.name = name;
		this.noTime = noTime;
		this.classFrequency = classFrequency;
		this.type = type;
		this.state = state;
	}

}
