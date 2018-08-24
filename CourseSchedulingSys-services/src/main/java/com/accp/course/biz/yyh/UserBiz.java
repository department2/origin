package com.accp.course.biz.yyh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accp.course.dao.yyh.IUserDao;
import com.accp.course.pojo.UserInfo;

/**
 * 用户表
 * 
 * @author yuanyuhui
 *
 */

@Service
public class UserBiz {

	@Autowired
	private IUserDao dao;

	/**
	 * 新增
	 */
	public int addUserInfo(UserInfo house) {
		return dao.saveUserInfo(house);
	};
}
