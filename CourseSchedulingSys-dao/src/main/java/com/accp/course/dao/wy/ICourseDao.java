package com.accp.course.dao.wy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.course.pojo.Course;

public interface ICourseDao {

	public List<Course> queryAll(@Param("course")Course course);
	
}
