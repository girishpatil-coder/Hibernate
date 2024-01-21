package com.d.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ThirdPartyEmployee extends Employee {

//	@Column(name = "Tpp_Payroll")
	
	private String payroll;

	public String getPayroll() {
		return payroll;
	}

	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}
	
	
	
}
