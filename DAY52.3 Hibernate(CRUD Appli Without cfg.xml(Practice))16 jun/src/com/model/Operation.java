package com.model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Operation {

	public void inserRecord() {

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		System.out.println("Enter Employee ID:");
		emp.setEmpid(sc.nextInt());

		System.out.println("Enter Employee Name:");
		emp.setName(sc.next());

		System.out.println("Enter Employee Address:");
		emp.setAddress(sc.next());

		Session s = HibernateUtil.getSessionFactory().openSession();

		s.save(emp); // to insert the record in database

		s.beginTransaction().commit();

	}

	public void deleteRecord() {

		System.out.println("Delete Record");

		Scanner sc = new Scanner(System.in);

		Employee e = null;

		System.out.println("Enter Employee id to be Deleted:");

		int id = sc.nextInt();

		Session s = HibernateUtil.getSessionFactory().openSession();

		e = (Employee) s.get(Employee.class, id);

		s.delete(e); // to delete the record in db

		s.beginTransaction().commit();

		System.out.println("object deleted successfully");

	}

	public void updateRecord() {
		System.out.println("update employee record called");

		System.out.println("enter employee id for which update:");

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		int id = sc.nextInt();

		emp.setEmpid(id);

		System.out.println("Enter name To be Update:");

		emp.setName(sc.next());

		System.out.println("Enter Address To be Update:");

		emp.setAddress(sc.next());

		Session s = HibernateUtil.getSessionFactory().openSession();

		s.update(emp);

		s.beginTransaction().commit();
	}

	public void diplayRecord() {
		System.out.println("Diplay Record");

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();

		Session s = HibernateUtil.getSessionFactory().openSession();

		System.out.println("Enter Id to Diplay Record:");

		int id = sc.nextInt();

		Employee e = s.get(Employee.class, id);

		System.out.println(e.getName());
		System.out.println(e.getAddress());

		s.beginTransaction().commit();

	}
	
	

}
