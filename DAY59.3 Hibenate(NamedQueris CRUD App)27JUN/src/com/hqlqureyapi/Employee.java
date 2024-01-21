package com.hqlqureyapi;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQueries({
	
	@NamedQuery(name = "diplay1", query = "from Employee"),
	@NamedQuery(name = "diplay2", query = "from Employee where empid=:id"),
	@NamedQuery(name = "diplay3", query = "from Employee where department=:dept AND address=:addr"),
	@NamedQuery(name = "diplay4", query = "from Employee where salary BETWEEN :sal1 AND :sal2"),
	@NamedQuery(name = "diplay5", query = "from Employee where firstname=:nm"),
	@NamedQuery(name = "update1", query = "update Employee set address=: adr ,salary=:sal where empid=:id"),
	@NamedQuery(name = "delete1", query = "delete from Employee where empid=:id")

	
})
public class Employee {

	@Id
	private int empid;
	private String firstname;
	private String lastname;
	private int salary;
	private String department;
	private String address;
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", department=" + department + ", address=" + address + "]";
	}
	
	
	
	
	
}
