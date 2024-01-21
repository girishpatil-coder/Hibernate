package com.onetoone.unidirection;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {

	
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Customer c=new Customer();
		c.setCustId(1);
		c.setCustName("ABC");
		c.setCustAddr("Pune");
		
		Order o=new Order();
		o.setOrderId(123);
		o.setProduct("Mobile");
		o.setCost(40000);
		
		
		c.setOrder(o);
		
		session.save(c);
		
		
		Customer c1=session.get(Customer.class, 1);
		System.out.println(c1.getCustId());
		System.out.println(c1.getCustName());
		System.out.println(c1.getCustAddr());
		System.out.println(c1.getOrder().getOrderId());
		System.out.println(c1.getOrder().getProduct());
		System.out.println(c1.getOrder().getCost());
		
		
		session.beginTransaction().commit();
		
		
	}

}
