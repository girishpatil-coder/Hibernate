package criterabuilder;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//where cause selsct * from where rollno=1;
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		

		CriteriaBuilder builder=session.getCriteriaBuilder();
		
	CriteriaQuery<Student> cqQuery=builder.createQuery(Student.class); 
		
	Root<Student> root=cqQuery.from(Student.class);
	
	cqQuery.select(root).where(builder.equal(root.get("rollno"), 1));
	
	Student s=session.createQuery(cqQuery).getSingleResult();
	
	System.out.println(s.getRollno());
	System.out.println(s.getName());
		
		
		
	}

}
