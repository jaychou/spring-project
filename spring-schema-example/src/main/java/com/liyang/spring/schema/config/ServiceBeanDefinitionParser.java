package com.liyang.spring.schema.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class ServiceBeanDefinitionParser extends AbstractSingleBeanDefinitionParser{

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		String id = element.getAttribute("id");
		String name = element.getAttribute("name");
		
		if(StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}
		
		if(StringUtils.hasText(name)) {
			builder.addPropertyValue("name", name);
		}
	}

	@Override
	protected Class<Service> getBeanClass(Element element) {
		return Service.class;
	}
	
	

}
