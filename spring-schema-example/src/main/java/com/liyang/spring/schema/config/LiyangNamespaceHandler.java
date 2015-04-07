package com.liyang.spring.schema.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class LiyangNamespaceHandler extends NamespaceHandlerSupport{

	public void init() {
		
		this.registerBeanDefinitionParser("service", new ServiceBeanDefinitionParser());
	}

}
