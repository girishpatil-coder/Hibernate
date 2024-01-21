package com.cjc.model;

import org.hibernate.Session;

public class TestSave {

	public static void main(String[] args) {
		
		
		
		Session s=HibernateUtil.getSessionFactory().openSession();
		
		Student stu=new Student();
		stu.setRollno(1);
		stu.setName("pqr");
		
		s.save(stu);
		
		s.beginTransaction().commit();
		
	}
	
	
	
	
}
