package com.onetoonee.bydirection;

import org.hibernate.Session;



public class Test {

	public static void main(String[] args) {
	
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		
		Customer cust=new Customer();
		cust.setCustId(1);
		cust.setCustName("Girish");
		cust.setCustAddr("Shirpur");
		
		Order ord=new Order();
		ord.setOrderId(12);
		ord.setProduct("ipad");
		ord.setCast(50000);
		
		cust.setOrder(ord);
		ord.setCustomer(cust);
		
		session.save(cust);
		session.save(ord);
	
		
		session.beginTransaction().commit();
		
	}
		
}
