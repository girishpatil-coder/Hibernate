package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestSave {

	public static void main(String[] args) {
		
		
		System.out.println("start Saving data in database");
		
		StandardServiceRegistry rg=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(rg);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		SessionFactory sf=md.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee e=new Employee();
		
		e.setId(1);
		
		e.setName("Girish");
		
		e.setDesignation("Host");
		
		session.save(e);
		
		session.beginTransaction().commit();
		
		
	}

}
