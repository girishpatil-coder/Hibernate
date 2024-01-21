package com.cjc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeService;
import com.cjc.service.EmployeeServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("Login Servlet Called");
		
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		EmployeeService service=new EmployeeServiceImpl();

		Employee e=service.logincheck(uname, password);
		
		if(e!=null)
		{
			if(e.getUname().equals(uname) && e.getPassword().equals(password)) {
				
			List<Employee> emplist=	service.getAll();
			
			request.setAttribute("list", emplist);	
			
				request.getRequestDispatcher("success.jsp").forward(request, response);
			}else {
				System.out.println("Login Fail!!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
				
		}else {
			
			System.out.println("Login Fail!!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}
	
}
