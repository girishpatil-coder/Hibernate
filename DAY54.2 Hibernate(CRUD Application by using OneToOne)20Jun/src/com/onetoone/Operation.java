package com.onetoone;

import java.util.Scanner;

import org.hibernate.Session;

public class Operation {

	public void saveRecord() {
		
		Scanner sc=new Scanner(System.in);
		
		Customer c=new Customer();
		Order o=new Order();
		
		System.out.println("Insert Record Called--");
		
		System.out.println("Enter Customer ID:-");
		c.setCustomerId(sc.nextInt());
		
		System.out.println("Enter Customer Name:-");
		c.setCustomerName(sc.next());
		
		
		System.out.println("Enter Customer Address:-");
		c.setCustomerAddress(sc.next());
		
		System.out.println("Enter Order ID:-");
		o.setOrderId(sc.nextInt());
		
		
		System.out.println("Enter Order Product:-");
		o.setProduct(sc.next());
		
		
		System.out.println("Enter Order Cost:-");
		o.setCost(sc.nextInt());
		
		
		c.setOrder(o);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		session.save(c);
		
		session.beginTransaction().commit();
		
		System.out.println("Data Saved!!!!!!!!!");
		
	}

	public void displayRecord() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Display Record Called");
		
		System.out.println("Plz Enter Customer ID:-");
		int id=sc.nextInt();
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Customer c=session.load(Customer.class, id);
		System.out.println(c);
		
		
		
	}

	public void updateRecord() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Update Record Called");
		Session session=HibernateUtil.getSessionFactory().openSession();
		Customer c1=new Customer();
		//Order o1=new Order();
		
		System.out.println("Plz Enter Customer ID which is doe you want to update:-");
		int id=sc.nextInt();
		c1.setCustomerId(id);
		c1=session.get(Customer.class, id);
		
		System.out.println("Enter Customer Name:-");
		c1.setCustomerName(sc.next());
		
		
		System.out.println("Enter Customer Address:-");
		c1.setCustomerAddress(sc.next());
		
		
		
//		System.out.println("Enter Order ID:-");
//		o1.setOrderId(sc.nextInt());
//		
		
		System.out.println("Enter Order Product:-");
		//o.setProduct(sc.next());
		c1.getOrder().setProduct(sc.next());
		
		System.out.println("Enter Order Cost:-");
		c1.getOrder().setCost(sc.nextInt());
		
		
//		
//		Customer c=session.get(Customer.class, id);
//		System.out.println(c);
//		
		//c1.setOrder(o1);
		
		session.update(c1);
		
		session.beginTransaction().commit();
		
		System.out.println("data update Successfully !!!!!!!!!!");
		
	}

	
	
	
	public void deleteRecord() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Delete Record Called");
		
		System.out.println("Plz Enter Customer ID:-");
		int id=sc.nextInt();
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Customer c=session.get(Customer.class, id);
		System.out.println(c);
		
		
		session.delete(c);
		
		session.beginTransaction().commit();
		
		System.out.println("data deleted Successfully !!!!!!!!!!");
		
	}

}
