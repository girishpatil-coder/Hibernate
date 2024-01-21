package com.hqlqureyapi;

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
		
		while(true)
		{
			System.out.println("1.Display All Record");
			System.out.println("2.Display Selected Record ");
			System.out.println("3.Display list all the employee where department and address");
			System.out.println("4.Dispaly list all employee whose salary between 45000 to 30000?");
			System.out.println("5.Display list all employees whose name start alphabet ");
			
			System.out.println("Enter Your choice:- ");
			int ch = sc.nextInt();
			
			switch (ch) {
	
			
			
			case 1:	System.out.println("Diplay All Record:-");
				
					Query<Employee> query=session.createQuery("from Employee");
			
						List<Employee> emplist=query.list();
			
						for (Employee employee : emplist) {
				
							System.out.println(employee);
							System.out.println("\n");
						}
						
					break;
				

			case 2: System.out.println("Enter Employee Id:-");
					
					Query<Employee> query1=session.createQuery("from Employee where empid=:id");
					
					query1.setParameter("id", sc.nextInt());

					List<Employee> emplist1 = query1.list();
					for (Employee e : emplist1) {
					System.out.println(e);
					System.out.println("\n");
					}
					
//					Employee emp1=query1.getSingleResult();
//				
//					System.out.println(emp1.getFirstname());
//					System.out.println(emp1.getLastname());
//					System.out.println(emp1.getSalary());
//					System.out.println(emp1.getDepartment());
//					System.out.println(emp1.getAddress());
					
				break;

			case 3: System.out.println("Enter Department And Address:-");
				
					Query<Employee> query2=session.createQuery("from Employee where department=:dept AND address=:addr");
				
					query2.setParameter("dept", sc.next());
					query2.setParameter("addr", sc.next());
					
					List<Employee> emplist2 = query2.list();
					for (Employee e : emplist2) {
					System.out.println(e);
					System.out.println("\n");
					}
					
				break;

			case 4: System.out.println("Enter two Salary between to get data:-");
				
					Query<Employee> query3=session.createQuery("from Employee where salary BETWEEN :sal1 AND :sal2");
			
						query3.setParameter("sal1", sc.nextInt());
						query3.setParameter("sal2", sc.nextInt());
			
						List<Employee> emplist3 = query3.list();
						for (Employee e : emplist3) {
							System.out.println(e);
							System.out.println("\n");
						}
				
//						Query query=session.createQuery("from Emp");  
//						query.setFirstResult(5);  
//						query.setMaxResult(10);  
//						List list=query.list();//will return the records from 5 to 10th number  
						
				break;

			case 5:	System.out.println("Enter First Latter:-");
				
					Query<Employee> query4=session.createQuery("from Employee where firstname=:nm");
			
				query4.setParameter("nm", sc.next());
				//query3.setParameter("sal2", sc.nextInt());

				List<Employee> emplist4 = query4.list();
				for (Employee e : emplist4) {
					System.out.println(e);
					System.out.println("\n");
				}
				
				break;

				
			default:System.exit(0);
				break;
			}
		}
	
		
	}
	
//--------------------------------------------------UpdateRecord-----------------------------------------------------------
	
	
	public void updateRecord() {
		
		Scanner sc=new Scanner(System.in);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
	
		String sql="update Employee set address=: adr ,salary=:sal where empid=:id";
		
		Query<Employee> query= session.createQuery(sql);
		
		System.out.println("Enter data update to addrss ,salary,id:");
		query.setParameter("adr",sc.next() );
		query.setParameter("sal", sc.nextInt());
		query.setParameter("id", sc.nextInt());
		session.beginTransaction();
		query.executeUpdate();
		System.out.println("update record");
		session.getTransaction().commit();
		
	}
	
	
//--------------------------------------------------deleteRecord-----------------------------------------------------------
	
		public void deleteRecord() {
	
			Scanner sc=new Scanner(System.in);
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			
			String sql = "delete from Employee where empid=:id";
			
			Query<Employee> query = session.createQuery(sql);
			
			System.out.println("Enter employee id for delete Record:");
			
			query.setParameter("id", sc.nextInt());
			
			session.beginTransaction();
			
			query.executeUpdate();
			
			session.getTransaction().commit();
			
		}
		
}


