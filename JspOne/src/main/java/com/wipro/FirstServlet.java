package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pr=response.getWriter();
		String i=request.getParameter("number");
		int j=Integer.parseInt(i);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int start=2;start<j;start++) {
			boolean flag=true;
			for(int k=2;k<start/2+1;k++) {
				if(start%2==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				list.add(start);
			}
		}
		request.setAttribute("arr", list);
		rd.forward(request, response);
		//pr.write("<h1>"+j+"</h1>");
	}

	

}
