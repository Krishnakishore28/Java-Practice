package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletExample extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		HttpSession session=req.getSession();
		String id=(String) session.getAttribute("id");
		PrintWriter pr=res.getWriter();
		if(id==null) {
			session.setAttribute("id", "sai");
			pr.write("<h1>hello first time you are visitig the page </h1>");
		}
		else {
			pr.write("<h1>welcome back</h1>");
		}
	}
}
