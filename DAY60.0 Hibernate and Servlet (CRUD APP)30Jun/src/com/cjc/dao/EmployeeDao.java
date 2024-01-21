package com.cjc.dao;

import java.util.List;

import com.cjc.model.Employee;

public interface EmployeeDao {

	
	public void addEmployee(Employee employee);
	
	public Employee logincheck(String uname,String password);
	
	public List<Employee> getAll();
	
	public void deleteEmployee(int id);
	
	public Employee getEmployeeById(int id);
	
	public void updateEmployee(Employee e);
}
