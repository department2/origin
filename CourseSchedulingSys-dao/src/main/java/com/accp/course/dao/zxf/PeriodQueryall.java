package com.accp.course.dao.zxf;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.course.pojo.Period;

public interface PeriodQueryall {
	 
	public List<Period> QueryAll();
	
	public int Delete(@Param("id") String id);
		

}
