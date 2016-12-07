package com.atos.dao;

import java.util.List;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atos.dao.EmpDao;
import com.atos.pojo.Employee;
@Repository
public class EmpDaoImp implements EmpDao {

@Autowired
SessionFactory sf;
	public Employee validateUser(Employee emp) {
		return (Employee)sf.getCurrentSession().createQuery("select e from Employee e where e.uname= :uname and e.passwd= :pass")
				.setParameter("uname", emp.getUname()).setParameter("pass", emp.getPasswd()).uniqueResult();
	}

	@Override
	public boolean addNewUser(Employee emp) {
		sf.getCurrentSession().persist(emp);
		return true;
	}
	
	 @SuppressWarnings("unchecked")
	 public List<Employee> listEmployee() {
	        return sf.getCurrentSession()
	            .createQuery("from Employee").list();
	    }
	
	 @Override
	    public void deleteEmployee(String dasID) {
	        sf.getCurrentSession().delete(dasID);
	    }
/*
	@Override
	public Employee getEmployeeById(int eid) {
		return (Employee) sf.getCurrentSession().createQuery("select b from Employee b where b.eid= :id").setParameter("id",eid);
	}
	*/
}
