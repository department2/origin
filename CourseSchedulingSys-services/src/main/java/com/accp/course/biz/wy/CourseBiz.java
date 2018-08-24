package com.accp.course.biz.wy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.course.dao.wy.ICourseDao;
import com.accp.course.pojo.Course;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CourseBiz {

	@Autowired
	private ICourseDao dao;
	
	public PageInfo<Course> findCourse(Course course,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Course>(dao.queryAll(course));
	}
	
}
