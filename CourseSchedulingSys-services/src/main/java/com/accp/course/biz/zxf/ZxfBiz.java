package com.accp.course.biz.zxf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.course.dao.zxf.PeriodQueryall;
import com.accp.course.pojo.Period;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service() 
public class ZxfBiz {
	
	@Autowired
	private PeriodQueryall dao;
	
	public PageInfo<Period> QueryAll(Integer size,Integer num){
		PageHelper.startPage(num,size);
		return new PageInfo<Period>(dao.QueryAll());
	}

	public int removePeriod(String id) {
		return dao.Delete(id);	
	}
	

}
