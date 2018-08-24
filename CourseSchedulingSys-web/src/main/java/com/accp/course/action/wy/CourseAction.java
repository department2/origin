package com.accp.course.action.wy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.course.biz.wy.CourseBiz;
import com.accp.course.pojo.Course;
import com.accp.course.vo.wy.CourseVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/courses")
public class CourseAction {

	@Autowired
	private CourseBiz biz;
	
	@RequestMapping(value="getCourse/{type}/{condition}/{pageNum}/{pageSize}",method = RequestMethod.GET)
	public PageInfo<CourseVo> queryCourse(@PathVariable String type,@PathVariable String condition,
			@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		CourseVo course = new CourseVo();
		if("period".equals(type)) {
			course.setName(condition);
		}else if("courseName".equals(type)) {
			course.setPeriodId(Integer.parseInt(condition));
		}
		PageInfo<CourseVo> page = biz.findCourse(course,pageNum,pageSize);
		return page;
	}
	
}
