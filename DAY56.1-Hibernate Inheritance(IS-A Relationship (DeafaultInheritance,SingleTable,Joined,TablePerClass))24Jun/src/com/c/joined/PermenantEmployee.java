package com.c.joined;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PermenantEmployee extends Employee {

//	@Column(name = "Prmt_Payroll")
	private String payroll;

	public String getPayroll() {
		return payroll;
	}

	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}





}
