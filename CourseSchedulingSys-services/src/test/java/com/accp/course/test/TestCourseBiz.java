package com.accp.course.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.course.biz.wy.CourseBiz;
import com.accp.course.pojo.Course;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/spring-ctx.xml"})
public class TestCourseBiz {
	
	@Autowired
	private CourseBiz biz;
	
	@Test
	public void testQuery() {
		PageInfo<Course> page = biz.findCourse(new Course(),1,10);
		for(Course course : page.getList()) {
			System.out.println(course.getName()); 
		}
	}

}
