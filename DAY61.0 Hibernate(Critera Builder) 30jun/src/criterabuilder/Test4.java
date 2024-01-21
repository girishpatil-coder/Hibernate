package criterabuilder;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=HibernateUtil.getSessionFactory().openSession();
		
		CriteriaBuilder builder=session.getCriteriaBuilder();
		
		CriteriaQuery<Object[]> cqQuery=builder.createQuery(Object[].class); 
			
		Root<Student> root=cqQuery.from(Student.class);
		
		cqQuery.multiselect(root.get("rollno"),root.get("name"));
		
		List<Object[]> list=session.createQuery(cqQuery).getResultList();
		
		for (Object[] obj : list) {
			
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			
		} 
		
	}

}
