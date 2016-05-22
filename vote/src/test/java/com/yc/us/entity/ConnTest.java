package com.yc.us.entity;

import static org.junit.Assert.*;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.us.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class ConnTest {
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void test02() {
	
		
		Connection con=sqlSessionFactory.openSession().getConnection();//取到数据库连接
	
		assertNotNull("数据库连接失败....",con);
	}
}