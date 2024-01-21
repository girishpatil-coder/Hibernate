package com.cjc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.cjc.model.Employee;
import com.cjc.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee employee) {
		
	Session session	=HibernateUtil.getSessionFactory().openSession();

		session.save(employee);
		
		session.beginTransaction().commit();
	
	
	}

	@Override
	public Employee logincheck(String uname, String password) {

		Session session	=HibernateUtil.getSessionFactory().openSession();

		String sql="select * from employee where uname=:Uname and password=:pass";
		
		Query<Employee> query=  session.createNativeQuery(sql,Employee.class);
		
		query.setParameter("Uname", uname);
		query.setParameter("pass", password);
		
//		Employee e=query.getSingleResult();
//		
//		System.out.println(e.getEmpid()+" "+e.getFirstname());
//
//		return e;
		
		List<Employee> e=  query.getResultList();
		 if(e.size()==0)
			 return null;
		return e.get(0);
		
	}

	@Override
	public List<Employee> getAll() {
		Session session	=HibernateUtil.getSessionFactory().openSession();
		
		List<Employee> emplist=session.createQuery("from Employee",Employee.class).list();
		
		return emplist;
	}

	@Override
	public void deleteEmployee(int id) {
		
		Session session= HibernateUtil.getSessionFactory().openSession();
	     Query<Employee> query=  session.getNamedQuery("deleteemp");
	 
	     	query.setParameter("id", id);
	        session.beginTransaction();
	        query.executeUpdate();
	        System.out.println("delete employee success!!!!!!!!");
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Session session	=HibernateUtil.getSessionFactory().openSession();
		
		Employee e	=session.get(Employee.class,id);
		
		return e;
	}

	@Override
	public void updateEmployee(Employee e) {
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.update(e);
		session.beginTransaction().commit();
	}

}
