package com.a.defaultInheritance;

import javax.persistence.Entity;

@Entity
public class PermenantEmployee extends Employee {

	private String payroll;

	public String getPayroll() {
		return payroll;
	}

	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}





}
