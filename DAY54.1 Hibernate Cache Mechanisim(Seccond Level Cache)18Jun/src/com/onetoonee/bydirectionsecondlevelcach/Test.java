package com.onetoonee.bydirectionsecondlevelcach;

import org.hibernate.Session;
import org.hibernate.Transaction;




public class Test {

	public static void main(String[] args) {
	
		Session session=HibernateUtil.getSessionFactory().openSession();
		
	
		Customer c=session.load(Customer.class, 1);
		System.out.println(c.getCustId());
		System.out.println(c.getCustName());
		System.out.println(c.getCustAddr());
		System.out.println(c.getOrder().getOrderId());
		System.out.println(c.getOrder().getProduct());
		System.out.println(c.getOrder().getCast());
		
		
		System.out.println("-------------------------");
		
		Customer c1=session.load(Customer.class, 1);
		System.out.println(c1.getCustId());
		System.out.println(c1.getCustName());
		System.out.println(c1.getCustAddr());
		System.out.println(c1.getOrder().getOrderId());
		System.out.println(c1.getOrder().getProduct());
		System.out.println(c1.getOrder().getCast());
		
		System.out.println("*************************************");
		
		
		Session session1=HibernateUtil.getSessionFactory().openSession();
		
		Customer c2=session1.load(Customer.class, 1);
		System.out.println(c2.getCustId());
		System.out.println(c2.getCustName());
		System.out.println(c2.getCustAddr());
		System.out.println(c2.getOrder().getOrderId());
		System.out.println(c2.getOrder().getProduct());
		System.out.println(c2.getOrder().getCast());
		
		
		
		
//		Transaction tx=session.beginTransaction();
//		
//		Customer cust=new Customer();
//		cust.setCustId(1);
//		cust.setCustName("Girish");
//		cust.setCustAddr("Shirpur");
//		
//		Order ord=new Order();
//		ord.setOrderId(12);
//		ord.setProduct("ipad");
//		ord.setCast(50000);
//		
//		cust.setOrder(ord);
//		ord.setCustomer(cust);
//		
//		session.save(cust);
//		session.save(ord);
//	
//		
//		tx.commit();
		
	}
		
}
