package com.accp.course.pojo;

import java.util.Date;

/**
 * @author wy 用户类，对应数据库user表
 */
public class UserInfo {

	private String id;    //用户编号
	private String name;   //用户名
	private String pwd;    //密码
	private String classId;    //班级编号
	private Integer roleId;    //角色编号
	private String sex;    //性别
	private String identityCard;    //身份证号码 
	private String phone;    //电话号码
	private String address;    //地址
	private Date inDate;    //入职日期
	private Date outDate;    //离职日期
	private Integer isLocked;    //是否冻结
	private String description;    //描述
	private String img;    //头像，Base64编码
	private Integer state;    //状态

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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public Integer getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Integer isLocked) {
		this.isLocked = isLocked;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public UserInfo() {
		super();
	}

	public UserInfo(String id, String name, String pwd, String classId, Integer roleId, String sex, String identityCard,
			String phone, String address, Date inDate, Date outDate, Integer isLocked, String description, String img,
			Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.classId = classId;
		this.roleId = roleId;
		this.sex = sex;
		this.identityCard = identityCard;
		this.phone = phone;
		this.address = address;
		this.inDate = inDate;
		this.outDate = outDate;
		this.isLocked = isLocked;
		this.description = description;
		this.img = img;
		this.state = state;
	}

}
