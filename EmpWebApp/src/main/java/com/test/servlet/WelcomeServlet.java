package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/*System.out.println(" Welcome Servlet ....");
		
		PrintWriter out = resp.getWriter();
		out.println("<HTML><HEAD><TITLE>DYNAMIC RESOURCE</TITLE></HEAD><BODY><H1>");
		out.println("Current \"Date\" : " + new Date());
		out.println("</BODY></HTML>");*/
		//Sending Data
		
		//B.L
		req.setAttribute("currentDate", new Date().toString());
		
		//View 
		RequestDispatcher rd = req.getRequestDispatcher("showDate.jsp");
		rd.forward(req, resp);
	}

}
