package com.b.singletable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ThirdPartyEmployee extends Employee {

	@Column(name = "Tpp_Payroll")
	private String payroll;

	public String getPayroll() {
		return payroll;
	}

	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}
	
	
	
}
