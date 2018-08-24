package com.accp.course.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.accp.course.biz.yyh.UserBiz;
import com.accp.course.pojo.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-ctx.xml" })
/**
 * 测试
 * 
 * @author yuanyuhui
 *
 */
public class TestYyh {
	@Autowired
	private UserBiz userbiz;

	private UserInfo user = new UserInfo("KQ-YG-20180821001", "1", "1", "1", 1, "1", "1", "1", "1", new Date(), new Date(), 1, "1", "1",
			1);

	/**
	 * 新增
	 * 
	 * @throws Exception
	 */
	@Test
	public void saveUserInfo() throws Exception {
		int count = userbiz.addUserInfo(user);
		System.out.println(count);
	}
}
