package com.yc.us.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.us.entity.Subject;
import com.yc.us.entity.SubjectBean;
import com.yc.us.entity.User;
import com.yc.us.service.SubjectService;
import com.yc.us.service.UserService;

@Controller("loginAction")
public class LoginAction implements ModelDriven<User>,SessionAware{
	
	@Autowired
	private UserService userService;
	@Autowired
	private SubjectService subjectService;
	
	private SubjectBean subjectBean;
	
	private User user;
	private Map<String, Object> session;
	
	
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public void setSubjectBean(SubjectBean subjectBean) {
		this.subjectBean = subjectBean;
	}


	public String login(){
		System.out.println("页面中查到的:\t\t"+user);
		user=userService.Login(user);
		if(user!=null){
			ActionContext.getContext().getSession().put("loginUser", user);
			System.out.println("数据库中查到的:\t\t"+user);
			return "success";
		}
		else{
			
			return "login";
		}
		
	}
	
	public String seacher(){
		System.out.println( "*****************进来了");
		List<SubjectBean> subjects=subjectService.getSubjectBean();
		ActionContext.getContext().getSession().put("subjects", subjects);
		
		return "success";
	}
	public String register(){
		if(userService.AddUser(user)>0){			
			session.put("user", user);
			return "success";
		}
		return "fail";
	}
	
	@Override
	public User getModel() {
		user=new User();
		
		return user;
	}


	@Override
	public void setSession(Map<String, Object> session) {	
		this.session = session;
		
	}


	

}
