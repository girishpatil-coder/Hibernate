package criterabuilder;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//retrive only string name
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		
	CriteriaQuery<String> cqQuery=builder.createQuery(String.class); 
		
	Root<Student> root=cqQuery.from(Student.class);
	
	cqQuery.select(root.get("name"));
	
	List<String> list=session.createQuery(cqQuery).getResultList();
	
	for (String student : list) {
		
		
		System.out.println(student);
		
	}
		
	}

}
