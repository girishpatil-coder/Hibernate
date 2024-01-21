package com.cjc.model;

import org.hibernate.Session;

public class LOADandGET {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student st=session.get(Student.class, 1);
		
		System.out.println(st.getRollno());
		System.out.println(st.getName());

		session.beginTransaction().commit();
		

	
		
	}
	
	
	
}
