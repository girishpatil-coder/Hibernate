package com.singletablecjc;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Karvenagar kv=new Karvenagar();
		kv.setId(1);
		kv.setCname("python");
		kv.setSname("abc");
		kv.setRegularbatch("B1");
		
		Akurdi ak=new Akurdi();
		ak.setId(2);
		ak.setCname("java");
		ak.setSname("xyz");
		ak.setWeekendbatch("B2");
		
		session.save(ak);
		session.save(kv);
		
		session.beginTransaction().commit();
		
	}
	
}
