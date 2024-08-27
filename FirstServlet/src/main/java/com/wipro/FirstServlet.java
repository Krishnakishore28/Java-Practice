package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter pr=res.getWriter();
		Enumeration<String> en=req.getParameterNames();
		while(en.hasMoreElements()) {
			String s=en.nextElement();
			pr.write("<p>"+ s+":"+req.getParameter(s)+"</p>");
			pr.write("<br>");;
		}
	}
	
}
