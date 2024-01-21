package com.d.tableperclass;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Employee e1=new Employee();
		e1.setEmpid(1);
		e1.setName("abc");
		e1.setAddress("pune");
		
		PermenantEmployee pe=new PermenantEmployee();
		pe.setEmpid(10);
		pe.setName(e1.getName());
		pe.setAddress(e1.getAddress());
		pe.setPayroll("company payroll");
		
		Employee e2=new Employee();
		e2.setEmpid(2);
		e2.setName("xyz");
		e2.setAddress("shirpur");
		
		
		ThirdPartyEmployee tpe=new ThirdPartyEmployee();
		tpe.setEmpid(11);
		tpe.setName(e2.getName());
		tpe.setAddress(e2.getAddress());
		tpe.setPayroll("consultancy payroll");
		
		
		
		session.save(e1);
		session.save(e2);
		session.save(pe);
		session.save(tpe);
		
		session.beginTransaction().commit();
		
		session.close();
		HibernateUtil.getSessionFactory().close();
		
		
	}

}
