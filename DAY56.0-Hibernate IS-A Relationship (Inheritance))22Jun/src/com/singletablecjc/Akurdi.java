package com.singletablecjc;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value = "akurdi")
public class Akurdi extends Cjc {

	
	public String getWeekendbatch() {
		return weekendbatch;
	}

	public void setWeekendbatch(String weekendbatch) {
		this.weekendbatch = weekendbatch;
	}

	private String weekendbatch;
	
}