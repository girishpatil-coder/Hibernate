package com.cjc.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Start Project");
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources ms=new MetadataSources(ssr);
		
		Metadata md=ms.getMetadataBuilder().build();
		
		SessionFactory sf=md.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Address adr=new Address();
		adr.setStreet("Krantinagar Road");
		adr.setCity("shirpur");
		adr.setOpen(false);
		adr.setAddedDate(new Date());
		adr.setX(1234.563);
		
		/*
		 * //Reading image try { FileInputStream file=new
		 * FileInputStream("E:\\C-J-C\\ecworksp\\AdvanceJava\\DAY51.0 Hibernate(Use Annotation in class for database  and add image)\\src\\Girish.jpeg"
		 * ); byte[] data=new byte[file.available()]; file.read(data);
		 * adr.setImage(data); } catch (IOException e) { // TODO: handle exception }
		 */
		session.save(adr);
		
		session.beginTransaction().commit();
		
	}

}
