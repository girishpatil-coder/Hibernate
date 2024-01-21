package com.model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Operation op=new Operation();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1 for insert Record");
			System.out.println("2 for update Record ");
			System.out.println("3 for Delete Record");
			System.out.println("4 for select Record");
			System.out.println("5 Exit");
		
			System.out.println("Enter Your Choice:");
			
			int ch=sc.nextInt();
			
			switch (ch) {
			
			case 1:
				op.inserRecord();
				break;

			case 2:
				op.updateRecord();
				break;

			case 3:
				op.deleteRecord();
				break;

			case 4:
				op.diplayRecord();
				break;

				
			default: System.exit(1);
				break;
			}
			
		
		
		
		
		}
		

	}

}
