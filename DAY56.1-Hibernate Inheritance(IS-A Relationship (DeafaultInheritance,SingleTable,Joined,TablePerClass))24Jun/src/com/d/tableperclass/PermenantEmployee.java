package com.d.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
