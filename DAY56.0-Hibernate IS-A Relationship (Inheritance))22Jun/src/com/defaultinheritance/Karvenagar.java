package com.defaultinheritance;

import javax.persistence.Entity;

@Entity
public class Karvenagar extends Cjc {

	public String getRegularbatch() {
		return regularbatch;
	}

	public void setRegularbatch(String regularbatch) {
		this.regularbatch = regularbatch;
	}

	private String regularbatch;
}
