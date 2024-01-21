package com.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HIbernateUtil {

	private static StandardServiceRegistry registry=null;
	private static SessionFactory sf;
	
	public static SessionFactory getSessionFactory()
	{
		if(sf==null)
			
		{
			registry=new StandardServiceRegistryBuilder().configure().build();
			
			MetadataSources mds=new MetadataSources(registry);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sf=md.getSessionFactoryBuilder().build();
			
			
		}
		
		return sf;
	}
	
	
}
