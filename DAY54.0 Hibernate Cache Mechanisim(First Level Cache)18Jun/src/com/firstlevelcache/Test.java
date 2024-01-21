package com.firstlevelcache;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		  
		  Session session=HIbernateUtil.getSessionFactory().openSession();
		  
		  Student stu=session.load(Student.class, 1);
		  System.out.println(stu.getName());
		  System.out.println(stu.getAddr());
		  
		  
		  System.out.println("------------------------");
		  
		  Student stu1=session.load(Student.class, 1);
		  System.out.println(stu1.getName());
		  System.out.println(stu1.getAddr());
		  
		  System.out.println("***************************************");
		  
		  Session session1=HIbernateUtil.getSessionFactory().openSession();
		  
		  Student stu2=session1.load(Student.class, 1);
		  System.out.println(stu2.getName()); 
		  System.out.println(stu2.getAddr());
		 
		  
		  
		  /*
			 * Student stu=new Student(); stu.setId(1); stu.setName("Girish");
			 * stu.setAddr("Shirpur");
			 */
		/*
		 * session.save(stu); session.beginTransaction().commit();
		 */
	}

}
