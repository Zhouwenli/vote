package com.yc.us.service.impl;

import static org.junit.Assert.*;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class JavaMailSenderTest {
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Test
	public void test() {
		SimpleMailMessage msg = new SimpleMailMessage();// 邮件信息类
		msg.setFrom("zhoujijiangzhou@163.com");  //邮件发送者
		msg.setTo("1208115756@qq.com");//邮件接收者
		msg.setSubject("Spring邮件整合测试"); //邮件主题
		msg.setText("Hi,你在干什么？你收的到不？收到请回复"); //邮件内容
		javaMailSender.send(msg);
		System.out.println("邮件发送成功...");
	}
	@Test
	public void test02() {
		MimeMessage ms = javaMailSender.createMimeMessage();// 邮件信息类
		
		try {
			MimeMessageHelper msg=new MimeMessageHelper(ms,true);
			msg.setFrom("zhoujijiangzhou@163.com");  //邮件发送者
			msg.setTo("85032606@qq.com");//邮件接收者
			msg.setSubject("这有毒.."); //邮件主题
			msg.setText("这有毒........." 
			+"<img src='cid:zwl'/>",true); //邮件内容
			FileSystemResource frs=new FileSystemResource("d:/10.jpg");
			msg.addInline("zwl", frs);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		javaMailSender.send(ms);
		System.out.println("邮件发送成功...");
	}

}
