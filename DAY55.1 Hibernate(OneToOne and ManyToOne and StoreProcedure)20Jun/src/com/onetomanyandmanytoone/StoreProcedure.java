package com.onetomanyandmanytoone;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class StoreProcedure {

	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		StoredProcedureQuery spq=session.createStoredProcedureQuery("phone_count");
		
		spq.registerStoredProcedureParameter("rno",Integer.class, ParameterMode.IN);
		spq.registerStoredProcedureParameter("phc", Integer.class, ParameterMode.OUT);
		
		spq.setParameter("rno", 1);
		
		spq.execute();
		
		int count=(int)spq.getOutputParameterValue("phc");
		System.out.println(count);
		
	}

}
