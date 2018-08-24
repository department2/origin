package com.accp.course.api.zxf;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.course.biz.zxf.ZxfBiz;
import com.accp.course.pojo.Period; 
import com.github.pagehelper.PageInfo;
 
@RestController
@RequestMapping("/api")
public class ZxfApi {
		 
		@Autowired
		private ZxfBiz biz;

		@RequestMapping(value = "zxf/{num}/{size}", method = RequestMethod.GET)
		public PageInfo<Period> getPersonListByPage(@PathVariable Integer num, @PathVariable Integer size)
				throws Exception {
			return biz.QueryAll(size, num);
		}
		
		@RequestMapping(value = "zxf/{id}", method = RequestMethod.DELETE)
		public Map<String, Object> ssss(@PathVariable String id)
				throws Exception {
			Map<String,Object> map = new HashMap<String,Object>();
			int r=biz.removePeriod(id);
			if(r>0) {
				map.put("code", 200);
				map.put("msg", "成功");
			}else {
				map.put("code", 500);
				map.put("msg", "失败");
			}
			return map;
		}
}
