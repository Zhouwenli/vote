package com.yc.us.action;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.us.entity.Item;
import com.yc.us.entity.Option;
import com.yc.us.entity.OptionBean;
import com.yc.us.entity.VoteBean;
import com.yc.us.service.SubjectService;

@Controller("voteAction")
public class VoteAction implements SessionAware ,ModelDriven<Item>{
	@Autowired
	private SubjectService subjectService;
	
	
	private Map<String, Object> session;


	private OptionBean optionBean;
	
	private VoteBean voteBean;
	private Item item;
	
	public void setVoteBean(VoteBean voteBean) {
		this.voteBean = voteBean;
	}
	
	public void setOptionBean(OptionBean optionBean) {
		this.optionBean = optionBean;
	}
	
	public String view() {
		LogManager.getLogger().debug("取到的主题id"+item.getVS_ID());
		optionBean=subjectService.findByOptionsById(item.getVS_ID());
		System.out.println("optionBean:\t\t\t"+optionBean);
		session.put("optionBean", optionBean);
		
		return "success";
	}
	
	public String vote(){
		voteBean=subjectService.findVoteBeanByIds(item.getVS_ID());
		session.put("voteBean", voteBean);
		return "success";
	}
	
	
	public String save(){
		//
		String[] VO_ID =ServletActionContext.getRequest().getParameterValues("VO_ID");
		LogManager.getLogger().debug("save"+item+"========="+"VO_ID="+Arrays.toString(VO_ID));
		if(subjectService.saveVote(item,VO_ID)){
			return "success";
		}
		session.put("saveMsg", "投票失败");
		return "saveFail";
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}

	@Override
	public Item getModel() {
		item=new Item();
		return item;
	}
	

	
}
