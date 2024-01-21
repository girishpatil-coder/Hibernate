package com.storeprocedure;

import java.util.List;

import javax.persistence.ParameterMode;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		
		Session session =HibernateUtil.getSessionFactory().openSession();

//*********************************** inserRecord **********************************
		
//		StoredProcedureQuery spl=session.createStoredProcedureQuery("insertRecord");
//		
//		spl.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);
//		spl.registerStoredProcedureParameter("adr", String.class, ParameterMode.IN);
//		spl.registerStoredProcedureParameter("nm", String.class, ParameterMode.IN);
//		spl.registerStoredProcedureParameter("sal", Integer.class, ParameterMode.IN);
//
//		spl.setParameter("id", 4);
//		spl.setParameter("adr", "Na");
//		spl.setParameter("nm", "GPtil");
//		spl.setParameter("sal", 45010);
//		
//		spl.execute();
//		
//		System.out.println("Data Inserted!!!");
		
		
//******************************** selectRecord ***************************************
	//error	
		StoredProcedureQuery sql=session.createStoredProcedureQuery("selectRecord",Employee.class);

			List<Employee> emplist = sql.getResultList();
			for (Employee emp: emplist) {
			
				System.out.println(emp);
			
			
			}
			
		
//	
//******************************** updateRecord **************************************
		
//		StoredProcedureQuery spl=session.createStoredProcedureQuery("updateRecord");
//		
//		spl.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);
//		spl.registerStoredProcedureParameter("nm", String.class, ParameterMode.IN);
//		
//		spl.setParameter("id", 3);
//		spl.setParameter("nm", "jayesh");
//		
//		spl.execute();
//		
//		System.out.println("data updata!!!");
////		
		
//****************************** deleteRecord **************************************		
//		
//		StoredProcedureQuery spl=session.createStoredProcedureQuery("deleteRecord");
//	
//		spl.registerStoredProcedureParameter("id", Integer.class, ParameterMode.IN);		
//		
//		spl.setParameter("id", 3);
//		
//		spl.execute();
//		
//		System.out.println("Data Delete!!!");
//		
//		
		
//***************************************************		
//		Employee e=new Employee();
//		e.setEmpid(1);
//		e.setName("Girish");
//		e.setAddress("pune");
//		e.setSalary(50000);
//		
//		session.save(e);
		
		session.beginTransaction().commit();
		
	}

}
