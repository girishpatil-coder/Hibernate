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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Delete Servlet !!");
		
		int id =Integer.parseInt(request.getParameter("id"));
		
		EmployeeService service=new EmployeeServiceImpl();
		
		service.deleteEmployee(id);
		
		System.out.println("employee deleted!!! ");
		
		List<Employee> emplist=service.getAll();
		
		request.setAttribute("list", emplist);
		
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}
	
}
