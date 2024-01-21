package com.model;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;


public class HibernateUtil {

	private static StandardServiceRegistry registry;
	private static  SessionFactory sf;
	
	public static SessionFactory getSessionFactory() {
		
		if (sf == null) {
			Map<String, Object> setting = new HashMap<>();

			setting.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			setting.put(Environment.URL, "jdbc:mysql://localhost:3306/crud");
			setting.put(Environment.USER, "root");
			setting.put(Environment.PASS, "Girish@9834");

			setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			setting.put(Environment.HBM2DDL_AUTO, "create");
			setting.put(Environment.SHOW_SQL, "true");

			registry = new StandardServiceRegistryBuilder().applySettings(setting).build();

			MetadataSources mds = new MetadataSources(registry);

			mds.addAnnotatedClass(Employee.class);
			mds.addAnnotatedClass(Department.class);

			Metadata md = mds.getMetadataBuilder().build();

			sf = md.getSessionFactoryBuilder().build();

		}

		return sf;
		
	}
	
	
}
