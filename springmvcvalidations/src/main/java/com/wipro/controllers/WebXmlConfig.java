package com.wipro.controllers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebXmlConfig {//implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		//--------for xml configuration -----------------
		/*XmlWebApplicationContext webApplicationContext=new XmlWebApplicationContext();
		webApplicationContext.setConfigLocation("classpath:mom-servlet.xml");*/
		
		
		//===============for annotation configuration ----------------------
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(ApplicationConfig.class);
		DispatcherServlet dispatcherServlet=new DispatcherServlet(webApplicationContext);
		ServletRegistration.Dynamic myDispatcherServlet=servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		myDispatcherServlet.setLoadOnStartup(1);
		myDispatcherServlet.addMapping("/home.com/*");
		
		
	}

}
