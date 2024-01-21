package com.model;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Department dpt1=new Department();
		dpt1.setDid(101);
		dpt1.setName("IT");
		
		Employee e1=new Employee();
		e1.setEmpid(1);
		e1.setName("xyz");
		e1.setDesignation("manager");
		e1.setDepartment(dpt1);
		
		Employee e2=new Employee();
		e2.setEmpid(2);
		e2.setName("abc");
		e2.setDesignation("mana");
		e2.setDepartment(dpt1);
		
		dpt1.getEmp().add(e1);
		dpt1.getEmp().add(e2);
		
		session.save(dpt1);
		
		session.beginTransaction().commit();
		
		
	}

}
