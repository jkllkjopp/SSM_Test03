package com.mjl.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.mjl.dao.IUserDao;
import com.mjl.model.User;

public class TestDao extends BaseTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IUserDao iUserDao;
	
	@Test
	public void testSelectByName(){
		
		User user = iUserDao.selectByName("alvin");
		System.out.println(user.getId()+":"+"username:"+user.getUsername());
		System.out.println("password:"+user.getPassword());
		
	}
	
}
