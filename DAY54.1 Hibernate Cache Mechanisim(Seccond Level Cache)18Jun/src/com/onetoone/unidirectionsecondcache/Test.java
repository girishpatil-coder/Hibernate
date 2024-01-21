package com.onetoone.unidirectionsecondcache;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {

	
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		
		Customer c=session.load(Customer.class, 1);
		System.out.println(c.getCustId());
		System.out.println(c.getCustName());
		System.out.println(c.getCustAddr());
		System.out.println(c.getOrder().getOrderId());
		System.out.println(c.getOrder().getProduct());
		System.out.println(c.getOrder().getCost());
		
		System.out.println("-------------------------");
		
		Customer c1=session.load(Customer.class, 1);
		System.out.println(c1.getCustId());
		System.out.println(c1.getCustName());
		System.out.println(c1.getCustAddr());
		System.out.println(c1.getOrder().getOrderId());
		System.out.println(c1.getOrder().getProduct());
		System.out.println(c1.getOrder().getCost());
		
		System.out.println("*************************************");
		
		
		Session session1=HibernateUtil.getSessionFactory().openSession();
		
		Customer c2=session1.load(Customer.class, 1);
		System.out.println(c2.getCustId());
		System.out.println(c2.getCustName());
		System.out.println(c2.getCustAddr());
		System.out.println(c2.getOrder().getOrderId());
		System.out.println(c2.getOrder().getProduct());
		System.out.println(c2.getOrder().getCost());
		
		
		
		/*
		 * Customer c=new Customer(); c.setCustId(1); c.setCustName("ABC");
		 * c.setCustAddr("Pune");
		 * 
		 * Order o=new Order(); o.setOrderId(123); o.setProduct("Mobile");
		 * o.setCost(40000);
		 * 
		 * 
		 * c.setOrder(o);
		 * 
		 * session.save(c);
		 */
		  
		  
		
		  
//		  
//		  session.beginTransaction().commit();
//		 		
		
	}

}
