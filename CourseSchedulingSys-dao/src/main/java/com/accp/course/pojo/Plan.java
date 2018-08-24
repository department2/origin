package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy 排课计划类
 */
public class Plan {

	private String id;    //计划编号
	private String drawupPersonName;    //计划指定人名称
	private Date drawupTime;    //计划制定时间
	private String noTime;    //无课时间
	private Integer select;    //是否当前选中计划
	private String remarks;    //备注
	private Integer prior;    //优先级
	private Integer state;    //状态

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDrawupPersonName() {
		return drawupPersonName;
	}

	public void setDrawupPersonName(String drawupPersonName) {
		this.drawupPersonName = drawupPersonName;
	}

	public Date getDrawupTime() {
		return drawupTime;
	}

	public void setDrawupTime(Date drawupTime) {
		this.drawupTime = drawupTime;
	}

	public String getNoTime() {
		return noTime;
	}

	public void setNoTime(String noTime) {
		this.noTime = noTime;
	}

	public Integer getSelect() {
		return select;
	}

	public void setSelect(Integer select) {
		this.select = select;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getPrior() {
		return prior;
	}

	public void setPrior(Integer prior) {
		this.prior = prior;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Plan() {
		super();
	}

	public Plan(String id, String drawupPersonName, Date drawupTime, String noTime, Integer select, String remarks,
			Integer prior, Integer state) {
		super();
		this.id = id;
		this.drawupPersonName = drawupPersonName;
		this.drawupTime = drawupTime;
		this.noTime = noTime;
		this.select = select;
		this.remarks = remarks;
		this.prior = prior;
		this.state = state;
	}

}
