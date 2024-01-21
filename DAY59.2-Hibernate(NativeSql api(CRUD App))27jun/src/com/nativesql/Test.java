package com.nativesql;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Test {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Scanner sc=new Scanner(System.in);
		
		Operation op=new Operation();
		
		while (true) {
			System.out.println("1 for insert Record");
			System.out.println("2 for display Record");
			System.out.println("3 for update Record");
			System.out.println("4 for Delete Record");
			System.out.println("5. exit");
			
			System.out.println("Enter Your choice:- ");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				op.saveRecord();
				break;
			case 2:
				op.diplayRecord();
				break;
			case 3:
				op.updateRecord();
				break;
			case 4:
				op.deleteRecord();
				break;
			case 5:
				System.exit(1);
				break;
				
			}
		}
		
	}

}

