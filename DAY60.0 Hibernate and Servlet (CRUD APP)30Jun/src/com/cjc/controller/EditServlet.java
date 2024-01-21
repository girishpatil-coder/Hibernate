package com.cjc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cjc.model.Employee;
import com.cjc.service.EmployeeService;
import com.cjc.service.EmployeeServiceImpl;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Edit sevlet");
		int id=Integer.parseInt(request.getParameter("id"));
		
		EmployeeService service=new EmployeeServiceImpl();
		
		Employee e=service.getEmployeeById(id);
		
		request.setAttribute("emp",e);
	
		request.getRequestDispatcher("update.jsp").forward(request	, response);
		
	
	
	}
	
	
}
