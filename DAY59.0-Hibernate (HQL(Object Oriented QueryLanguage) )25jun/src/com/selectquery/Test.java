package com.selectquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test {
	
	public static void main(String[] args) {
		
		
	Session session=	HibernateUtil.getSessionFactory().openSession();
	
	//select data from database 1st Method to get data or
	
	Query<Student> query=session.createQuery("from Student",Student.class);
	
	List<Student> list=query.getResultList();
	
	for (Student stu: list) {
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
		System.out.println("-------");
		
	}
	
	
	
	
			//insert data in database
//		Student s=new Student();
//		s.setRollno(2);
//		s.setName("patil");
//		s.setAddress("dhule");
//	
//		session.save(s);
//		
//		session.beginTransaction().commit();
		
	}

}
