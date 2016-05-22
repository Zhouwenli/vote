package com.yc.us.action;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.us.entity.InsertBean;
import com.yc.us.service.SubjectService;

@Controller("subjectAction")
public class SubjectAction implements ModelDriven<InsertBean>{
	private InsertBean insertBean;
	
	@Autowired
	private SubjectService subjectService;
	

	

	public String save(){
		LogManager.getLogger().debug("SubjectAction取到的参数数据====>"+insertBean);
		try {
			subjectService.add(insertBean);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "fail";
	}

	@Override
	public InsertBean getModel() {
		insertBean=new InsertBean();
		return insertBean;
	}

}
