package com.b.singletable;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		PermenantEmployee pe=new PermenantEmployee();
		pe.setName("abc");
		pe.setAddress("pune");
		pe.setPayroll("company payroll");
		
		
		ThirdPartyEmployee tpe=new ThirdPartyEmployee();
		tpe.setName("xyz");
		tpe.setAddress("shirpur");
		tpe.setPayroll("consultancy payroll");
		
		session.save(pe);
		session.save(tpe);
		
		session.beginTransaction().commit();
		
		session.close();
		HibernateUtil.getSessionFactory().close();
		
		
	}

}
