package com.identity;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session =HibernateUtil.getSessionFactory().openSession();


		Employee e=new Employee();
		//e.setEmpid(1);
		e.setName("naresh");
		e.setAddress("dhule");
		e.setSalary(44444);
		
		session.save(e);
		
		session.beginTransaction().commit();
		
	}

}
