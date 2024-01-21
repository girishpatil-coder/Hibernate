package com.deletequery;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Test {
	
	public static void main(String[] args) {
		
		
	Session session=	HibernateUtil.getSessionFactory().openSession();
	
	//delete data in database 
	
	Query<Student> query=session.createQuery("delete from Student where rollno=:rno");
	

	query.setParameter("rno", 1);
	
	Transaction tx=session.beginTransaction();
	
	query.executeUpdate();
	tx.commit();
	
	
//			//insert data in database
//		Student s=new Student();
//		s.setRollno(3);
//		s.setName("girish");
//		s.setAddress("sadasdsa");
//	
//		session.save(s);
//		
//		session.beginTransaction().commit();
		
	}

}
