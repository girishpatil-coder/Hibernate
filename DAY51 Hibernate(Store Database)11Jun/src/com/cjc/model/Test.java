package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardServiceRegistry rg=new StandardServiceRegistryBuilder().configure("com/cjc/model/hibernate.cfg.xml").build();
		
		MetadataSources mds=new MetadataSources(rg);
		
		Metadata md=mds.getMetadataBuilder().build();
		
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session session=sf.openSession();
		
		
		Student stu= new Student();
		
		stu.setId(3);
		stu.setName("Girish");
		stu.setAddr("pune");
		
		session.save(stu);
		
		session.beginTransaction().commit();
		
		
	}

}
