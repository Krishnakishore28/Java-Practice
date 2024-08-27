package com.wipro;

import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletExample extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse res) {
		ServletConfig config=getServletConfig();
		Enumeration<String> en=config.getInitParameterNames();
		while(en.hasMoreElements()) {
			String s=en.nextElement();
			System.out.println(s+" "+config.getInitParameter(s));
		}
		ServletContext context=getServletContext();
		Enumeration<String> en1=context.getInitParameterNames();
		while(en1.hasMoreElements()) {
			String s=en1.nextElement();
			System.out.println(s+" "+context.getInitParameter("email"));
		}
	}
}
