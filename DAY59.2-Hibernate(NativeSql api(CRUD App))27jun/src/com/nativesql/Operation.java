package com.nativesql;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Operation {

	public void saveRecord() {
		
		Scanner sc=new Scanner(System.in);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		System.out.println("Enter Number for how much data do you want to save:-");
		int n=sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			
			Employee emp= new Employee();
			
			
			System.out.println("Enter Employee id:-");
			emp.setEmpid(sc.nextInt());
			
			System.out.println("Enter Employee First Name:-");
			emp.setFirstname(sc.next());;
			
			System.out.println("Enter Employee Last Name:-");
			emp.setLastname(sc.next());;
			
			System.out.println("Enter Employee salary:-");
			emp.setSalary(sc.nextInt());
			
			System.out.println("Enter Employee Department:-");
			emp.setDepartment(sc.next());;
			
			System.out.println("Enter Employee address:-");
			emp.setAddress(sc.next());
		
			session.save(emp);
			
		}
		
		session.beginTransaction().commit();
	
	}
	
//--------------------------------------------------DisplayRecord-----------------------------------------------------------	
	
	public void diplayRecord() {
		
		Scanner sc=new Scanner(System.in);
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		String sql="select * from employee";
		Query query= session.createNativeQuery(sql);
		
		List<Object []> emplist= query.list();
		
		for(Object[] emp: emplist) {
		int empid=(int)emp[0];
		String address=(String)emp[1];
		String name=(String)emp[3];
		
		System.out.println("empid="+ empid+"\n" + "name="+name+"\n" +"address="+ address);
		}
	}
//--------------------------------------------------UpdateRecord-----------------------------------------------------------
	
	
	public void updateRecord() {
		
		Scanner sc=new Scanner(System.in);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
	
		String sql="update employee set address=? where empid=?";
		Query query= session.createNativeQuery(sql);
		System.out.println("Enter id and address:-");
		query.setInteger(2, sc.nextInt());
		query.setString(1, sc.next());
		// query.setParameter("adr", "mumbai");
		// query.setParameter("id", 2);
		session.beginTransaction();
		query.executeUpdate();
		session.getTransaction().commit();
		}
		
		
	
	
	
//--------------------------------------------------deleteRecord-----------------------------------------------------------
	
		public void deleteRecord() {
	
			Scanner sc=new Scanner(System.in);
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			
			String sql = "delete from Employee where empid=:id";
			Query<Employee> query = session.createQuery(sql);
			System.out.println("Enter employee id to be delete:");
			query.setParameter("id", sc.nextInt());
			session.beginTransaction();
			query.executeUpdate();
			session.getTransaction().commit();
			
		}
		
}


