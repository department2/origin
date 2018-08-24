package com.accp.course.dao.wy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.course.pojo.Course;
import com.accp.course.vo.wy.CourseVo;

public interface ICourseDao {

	public List<CourseVo> queryAll(@Param("course")CourseVo course);
	
}
