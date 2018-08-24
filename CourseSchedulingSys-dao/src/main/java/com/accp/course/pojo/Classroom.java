package com.accp.course.pojo;

/**
 * @author wy 教室类
 */
public class Classroom {

	private Integer id;    //教室编号
	private String name;    //教室名称
	private Integer floor;    //教室所属楼层
	private Integer isClassRoom;    //是否为上课教室
	private Integer enabled;   //是否可用
	private Integer state;    //状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Integer getIsClassRoom() {
		return isClassRoom;
	}

	public void setIsClassRoom(Integer isClassRoom) {
		this.isClassRoom = isClassRoom;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Classroom() {
		super();
	}

	public Classroom(Integer id, String name, Integer floor, Integer isClassRoom, Integer enabled, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.floor = floor;
		this.isClassRoom = isClassRoom;
		this.enabled = enabled;
		this.state = state;
	}

}
