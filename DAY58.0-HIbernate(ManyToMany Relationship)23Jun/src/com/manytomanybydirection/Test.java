package com.manytomanybydirection;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Session session=	HibernateUtil.getSessionFactory().openSession();
	
			Course c1=new Course();
			c1.setCid(1);
			c1.setCname("Python");
			
			Course c2=new Course();
			c2.setCid(2);
			c2.setCname("java");
			
			
			Student s=new Student();
			s.setRollno(1);
			s.setName("Girish");
			s.setAddress("Pune");
			
			
			
			s.getSc().add(c1);
			s.getSc().add(c2);
			
			
			
			session.save(s);
			
			session.beginTransaction().commit();
			session.close();
	}

}
