package com.onetomanyandmanytoone;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student stu=new Student();
		stu.setRollno(1);
		stu.setName("patil");
		stu.setAddr("pune");
		
		Phone p1=new Phone();
		p1.setId(1);
		p1.setPhno("8745623425");
		p1.setStudent(stu);
		
		Phone p2=new Phone();
		p2.setId(2);
		p2.setPhno("9865321475");
		p2.setStudent(stu);
		
		stu.getSphone().add(p1);
		stu.getSphone().add(p2);
		
		session.save(stu);
		
		session.beginTransaction().commit();
		
	}

}
