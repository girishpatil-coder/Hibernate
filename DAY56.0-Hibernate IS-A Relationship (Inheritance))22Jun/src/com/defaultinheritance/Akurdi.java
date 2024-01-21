package com.defaultinheritance;

import javax.persistence.Entity;

@Entity
public class Akurdi extends Cjc {

	public String getWeekendbatch() {
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}

	private String weekendbatch;
	
}
