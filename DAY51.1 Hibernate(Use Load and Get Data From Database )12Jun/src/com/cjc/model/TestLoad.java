package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start Load data in database");
		
		StandardServiceRegistry rg=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(rg);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		
		//data get through database using load();
		
		Employee em=session.load(Employee.class, 1);
		
		System.out.println(em.getId());
		
		System.out.println(em.getName());
		
		System.out.println(em.getDesignation());
	
	
		session.beginTransaction().commit();
		
	}

}
