package com.wipro.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Config extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class arr[]= {ApplicationConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] arr= {"/"};
		return arr;
	}

}