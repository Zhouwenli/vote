package com.yc.us.action;

import java.util.Map;
import java.util.UUID;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.yc.us.entity.User;
import com.yc.us.service.UserService;

@Controller("registerMailAction")
public class RegisterMailAction implements ModelDriven<User>,SessionAware{
	@Autowired
	private UserService userservice;
	@Autowired
	private JavaMailSender javaMailSender;
	
	private User user;
	
	private Map<String, Object> session;

	public void setUser(User user) {
		this.user = user;
	}
	public String sendEmail(){
		System.out.println("进来了哦");
		System.out.println(user);
		MimeMessage ms = javaMailSender.createMimeMessage();// 邮件信息类
		
		try {
			MimeMessageHelper msg=new MimeMessageHelper(ms,true);
			msg.setFrom("zhoujijiangzhou@163.com");  //邮件发送者
			String  email =user.getVU_EMAIL();
			System.out.println(email);
			msg.setTo(email);//邮件接收者
			msg.setSubject("这有毒.."); //邮件主题
			String actionId=UUID.randomUUID().toString();//激活号
			String activePath="http://localhost:8080/vote/user_active.action?actionId="+actionId+"&email="+email;
			msg.setText("激活账号：<a href='"+activePath+"'>"+activePath+"</a>",true); //邮件内容
			javaMailSender.send(ms);
			ActionContext.getContext().getSession().put("actionId", actionId);
			ActionContext.getContext().getSession().put("email", email);

			return "success";
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return "fail";
	}
		public String active(){
			
			
			String VU_EMAIL=ServletActionContext.getRequest().getParameter("email");
			System.out.println(VU_EMAIL);
			String actionId=ServletActionContext.getRequest().getParameter("actionId");
			System.out.println(actionId);
			
			
			int result=userservice.updateStudius(VU_EMAIL);
			if(result>0){
				System.out.println(user);
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
