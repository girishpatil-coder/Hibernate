package criterabuilder;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;


public class Test1 {

	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		
		
		
		/*
		 * Student s=new Student(); s.setRollno(3); s.setName("naresh");
		 * 
		 * session.save(s);
		 * 
		 * session.beginTransaction().commit();
		 */
		 
		
		//select data to retrive
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		
	CriteriaQuery<Student> cqQuery=builder.createQuery(Student.class); 
		
	Root<Student> root=cqQuery.from(Student.class);
	
	cqQuery.select(root);
	
	List<Student> list=session.createQuery(cqQuery).getResultList();
	
	for (Student student : list) {
		
		System.out.println(student.getRollno());
		System.out.println(student.getName());
		
	}
		
	}
}
