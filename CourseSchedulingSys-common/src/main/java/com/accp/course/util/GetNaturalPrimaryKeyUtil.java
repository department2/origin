package com.accp.course.util;

import java.io.IOException;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.course.dao.wy.IUtilDao;

public class GetNaturalPrimaryKeyUtil {
	
	/**
	 * 自动获得数据库自然主键
	 * @param roleName  插入实体名称：student,teacher,class,plan
	 * @return 自然主键
	 */
	public synchronized static String getKey(String roleName) {
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		SqlSessionFactory ssf = null;
		try {
			ssf = ssfb.build(Resources.getResourceAsStream("config.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSession session = ssf.openSession();
		IUtilDao dao = session.getMapper(IUtilDao.class);
		StringBuffer sb = new StringBuffer();
		String tableName = roleName;
		if("class".equals(tableName)) {
			sb.append("KQ-BJ-");
		}else if("teacher".equals(tableName)) {
			sb.append("KQ-YG-");
			tableName = "user";
		}else if("plan".equals(tableName)) {
			sb.append("KQ-JH-");
		}else if("student".equals(tableName)) {
			sb.append("KQ-XS-");
			tableName = "user";
		}
		String date = DateFormatUtil.formatDateToString(new Date(), "yyyyMMdd");
		sb.append(date);
		String result = dao.getKeyCount(tableName,sb.toString());
		if(result == null) {
			sb.append("001");
		}else {
			result = result.substring(result.length()-3, result.length());
			int no = Integer.parseInt(result);
			no++;
			result = String.valueOf(no);
			if(result.length() == 1) {
				sb.append("00"+result);
			}else if(result.length() == 2) {
				sb.append("0"+result);
			}else {
				sb.append(result);
			}
		}
		return sb.toString();
	}

}
