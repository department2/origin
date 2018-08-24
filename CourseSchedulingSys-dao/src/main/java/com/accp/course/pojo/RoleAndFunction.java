package com.accp.course.pojo;

/**
 * @author wy
 * 角色权限表
 */
public class RoleAndFunction {

	private Integer id;    //编号
	private String functionId;    //权限编号
	private Integer roleId;    //角色编号
	private String insert;    //增加权限
	private String delete;    //删除权限
	private String update;    //更新权限
	private String select;    //查询权限
	private Integer state;    //状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getInsert() {
		return insert;
	}

	public void setInsert(String insert) {
		this.insert = insert;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getSelect() {
		return select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public RoleAndFunction() {
		super();
	}

	public RoleAndFunction(Integer id, String functionId, Integer roleId, String insert, String delete, String update,
			String select, Integer state) {
		super();
		this.id = id;
		this.functionId = functionId;
		this.roleId = roleId;
		this.insert = insert;
		this.delete = delete;
		this.update = update;
		this.select = select;
		this.state = state;
	}

}
