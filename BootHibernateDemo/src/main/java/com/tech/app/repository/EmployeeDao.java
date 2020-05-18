package com.tech.app.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.app.entities.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createEmployee(Employee employee) {
		
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
