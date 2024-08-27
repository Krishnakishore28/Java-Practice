package com.wipro;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreeJspDisplay
 */
public class ThreeJspDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreeJspDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i=Integer.parseInt( request.getParameter("number"));
		String str1="";
		if(i<10) {
			str1="page1.jsp";
			
		}
		else if(i>10 && i<99) {
			str1="page2.jsp";
		}
		else {
			str1="error.jsp";
		}
		RequestDispatcher rd=request.getRequestDispatcher(str1);
		rd.forward(request, response);
	}

}
