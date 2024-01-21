package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test_LOAD_and_GET {

	public static void main(String[] args) {
		
	
		
		Session session = HIbernateUtil.getSessionFactory().openSession();


		/*
		 * Student stu=session.load(Student.class, 1);
		 */
		
		StudentUtil stu = session.get(StudentUtil.class, 1);

		System.out.println(stu.getRollno());
		System.out.println(stu.getName());

		session.beginTransaction().commit();
		

	}

}
