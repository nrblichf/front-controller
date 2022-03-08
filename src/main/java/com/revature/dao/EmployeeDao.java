package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDao {
	public int insert(Employee e) {
		Session session = HibernateUtil.getSession();
		
		Transaction tx = session.beginTransaction();
		
		int pk = (int) session.save(e);
		
		tx.commit();
		
		return pk;
	}
	
	public List<Employee> findAll() {
		Session session = HibernateUtil.getSession();
		
		List<Employee> emps = session.createQuery("FROM employee", Employee.class).list();
		
		return emps;
	}
	
	public Employee findById() {
		
	}
	
	public boolean delete(int id) {
		Session session = HibernateUtil.getSession();
		
		Employee emp = this.findById();
		
		if () {
		Transaction tx = session.beginTransaction();
		
		session.delete(emp);
		
		}
		
		return false;
	}
	
	public boolean update(Employee e) {
		
	}
}
