package com.accp.course.dao.wy;

import org.apache.ibatis.annotations.Param;

public interface IUtilDao {
	
	public String getKeyCount(@Param("tableName")String tableName,@Param("keyRule")String keyRule);

}
