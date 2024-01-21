package com.selectquery;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Test1 {

	public static void main(String[] args) {
		
		Session session=	HibernateUtil.getSessionFactory().openSession();
		
		// or select data from database 2nd Method to get data
		
		Query<Student> query=session.createQuery("from Student where rollno=:id");
		
		query.setParameter("id", 2);
		
		Student stu=query.getSingleResult();
		
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());

	}

}
