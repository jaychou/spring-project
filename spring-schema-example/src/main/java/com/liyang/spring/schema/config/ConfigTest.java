package com.liyang.spring.schema.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class ConfigTest extends TestCase{
	
	public void testConfig() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	    Service bean = (Service)context.getBean("lijieran");
	    System.out.println(bean.getName());
	}

}
