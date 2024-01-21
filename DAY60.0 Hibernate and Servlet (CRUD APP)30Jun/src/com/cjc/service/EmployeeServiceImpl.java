package com.cjc.service;

import java.util.List;

import com.cjc.dao.EmployeeDao;
import com.cjc.dao.EmployeeDaoImpl;
import com.cjc.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	
	EmployeeDao dao=new EmployeeDaoImpl();
	
	@Override
	public void addEmployee(Employee employee) {
		
		System.out.println("Add Employee Service");
		
		dao.addEmployee(employee);
		
	}

	@Override
	public Employee logincheck(String uname, String password) {

		System.out.println("login check service");
		
		return dao.logincheck(uname, password);
	}

	@Override
	public List<Employee> getAll() {
	
		System.out.println("Get All  Employee Service");
		
		return dao.getAll();
	}

	@Override
	public void deleteEmployee(int id) {
		System.out.println("Delete employee Service");
		dao.deleteEmployee(id);
	}

	@Override
	public Employee getEmployeeById(int id) {
		System.out.println("get employee id called ");
		
		return dao.getEmployeeById(id);
	}

	@Override
	public void updateEmployee(Employee e) {

		dao.updateEmployee(e);
	}

	
}
