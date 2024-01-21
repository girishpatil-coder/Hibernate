package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestSave {

	public static void main(String[] args) {

		
		
		Session session=HIbernateUtil.getSessionFactory().openSession();
		
		StudentUtil stu=new StudentUtil();
		stu.setRollno(2);
		stu.setName("abc");
		
		session.save(stu);
		
		session.beginTransaction().commit();
		

	}

}
