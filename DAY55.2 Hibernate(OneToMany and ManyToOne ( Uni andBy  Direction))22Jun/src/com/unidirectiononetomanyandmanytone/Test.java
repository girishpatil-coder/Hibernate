package com.unidirectiononetomanyandmanytone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Department d=new Department();
		
		System.out.println("Enter Department Id:-");
		d.setDeptId(sc.nextInt());
		
		System.out.println("Enter Department Name:-");
		d.setDeptName(sc.next());
		
		List<Employee> emplist=new ArrayList<Employee>();
		System.out.println("Enter Number of employee do you want to add:-");
		int count=sc.nextInt();
		
		for (int i = 1; i <=count; i++) {
			
			Employee e=new Employee();
			
			System.out.println("Enter the employee Id:-");
			e.setEmpId(sc.nextInt());
			
			System.out.println("Enter the employee name:-");
			e.setEmpName(sc.next());
			
			emplist.add(e);
		}
		
		d.setEmplist(emplist);
		session.save(d);
		session.beginTransaction().commit();
		
	}

}
