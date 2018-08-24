package com.accp.course.action.wy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.course.biz.wy.CourseBiz;
import com.accp.course.pojo.Course;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/courses")
public class CourseAction {

	@Autowired
	private CourseBiz biz;
	
	@RequestMapping(value="getCourse/{type}/{condition}/{pageNum}/{pageSize}",method = RequestMethod.GET)
	public PageInfo<Course> queryCourse(@PathVariable String type,@PathVariable String condition,
			@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		PageInfo<Course> page = biz.findCourse(new Course(),pageNum,pageSize);
		return page;
	}
	
}
