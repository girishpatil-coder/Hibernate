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

@WebServlet("/updateEmployee")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Update Servlet called!!");
		
		Employee e=new Employee();
		
		  e.setEmpid(Integer.parseInt(request.getParameter("id")));
		
		 e.setFirstname(request.getParameter("firstname"));
		e.setLastname(request.getParameter("lastname"));
		e.setMail(request.getParameter("mail"));
		e.setUname(request.getParameter("uname"));
		e.setPassword(request.getParameter("password"));
		e.setSalary(Integer.parseInt(request.getParameter("salary")));
		
		EmployeeService service=new EmployeeServiceImpl(); 
		service.updateEmployee(e);
		
		List<Employee> elist=service.getAll();
		request.setAttribute("list", elist);
		request.getRequestDispatcher("success.jsp").forward(request, response);
	
	
	}
	
}
