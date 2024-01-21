package com.updatequery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Test {
	
	public static void main(String[] args) {
		
		
	Session session=	HibernateUtil.getSessionFactory().openSession();
	
	//update data in database 
	
	Query<Student> query=session.createQuery("update Student set name=:nm where rollno=:rno ");
	
	query.setParameter("nm", "jayesh");
	query.setParameter("rno", 1);
	
	Transaction tx=session.beginTransaction();
	
	query.executeUpdate();
	
	
	
//			//insert data in database
//		Student s=new Student();
//		s.setRollno(2);
//		s.setName("naresh");
//		s.setAddress("dhu");
//	
//		session.save(s);
//		
//		session.beginTransaction().commit();
		
	}

}
