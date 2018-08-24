package com.accp.course.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.course.biz.wy.CourseBiz;
import com.accp.course.pojo.Course;
import com.accp.course.vo.wy.CourseVo;
import com.github.pagehelper.PageInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:/spring-ctx.xml"})
public class TestCourseBiz {
	
	@Autowired
	private CourseBiz biz;
	
	@Test
	public void testQuery() {
		PageInfo<CourseVo> page = biz.findCourse(new CourseVo(),1,10);
		for(CourseVo course : page.getList()) {
			System.out.println(course.getName()); 
		}
	}

}
