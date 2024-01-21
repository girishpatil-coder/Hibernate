package com.manytomanybydirection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	private int rollno;
	private String name;
	private String address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course",joinColumns = {@JoinColumn(name="rno")},inverseJoinColumns = {@JoinColumn(name="cno")})
	private Set<Course> sc=new HashSet<Course>();

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Course> getSc() {
		return sc;
	}

	public void setSc(Set<Course> sc) {
		this.sc = sc;
	}
	
}
