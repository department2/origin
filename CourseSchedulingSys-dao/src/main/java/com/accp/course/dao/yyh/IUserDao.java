package com.accp.course.dao.yyh;

import org.apache.ibatis.annotations.Param;

import com.accp.course.pojo.UserInfo;

/**
 * 用户表
 * 
 * @author yuanyuhui
 *
 */
public interface IUserDao {
	
	/**
	 * 新增
	 */
	public int saveUserInfo(@Param("U") UserInfo house);
}
