package com.accp.course.pojo;

/**
 * @author wy 权限类
 */
public class Function {

	private String id;    //功能编号
	private String name;    //功能名称
	private String parentId;    //父级编号
	private String url;    //访问链接
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

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Function() {
		super();
	}

	public Function(String id, String name, String parentId, String url, Integer state) {
		super();
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.url = url;
		this.state = state;
	}

}
