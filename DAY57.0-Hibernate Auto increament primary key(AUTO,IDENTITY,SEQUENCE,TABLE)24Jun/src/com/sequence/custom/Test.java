package com.sequence.custom;


import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session =HibernateUtil.getSessionFactory().openSession();


		Employee e=new Employee();
		//e.setEmpid(1);
		e.setName("patil");
		e.setAddress("shirpur");
		e.setSalary(1200);
		
		session.save(e);
		
		session.beginTransaction().commit();
		
	}

}
