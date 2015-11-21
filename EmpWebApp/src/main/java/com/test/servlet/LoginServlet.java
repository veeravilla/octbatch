package com.test.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.model.Employee;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//Read user input
		String userName = request.getParameter("UserID");
		String password = request.getParameter("PASSWORD");
		
		//B.L
		if(userName.equals("jhon") && password.equals("password123")){
			//success flow
			//Data / Model  // TODO: Get teh data from DB/BackEnd
			Employee emp = new Employee(876, "Jhon", 5600);
			request.setAttribute("emp", emp);
			response.getWriter().println("Lgin Resource Output .......");
			RequestDispatcher rd = request.getRequestDispatcher("emplanding.jsp");
			rd.include(request, response);
		}else
		{
			//Login Failed
			request.setAttribute("error", "USerName or PAssword Wrong. Please try again!!");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
		}
	}

}
