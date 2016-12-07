package com.atos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atos.dao.EmpDao;
import com.atos.dao.EmpDaoImp;
import com.atos.pojo.Employee;
import com.atos.services.EmpService;
@Service
@Transactional
public class EmpServiceImp implements EmpService {
	@Autowired
	private EmpDao dao;
	public Employee getValidateUser(Employee emp) {
		return dao.validateUser(emp);
	}
	
	public boolean getRegisterCustomer(Employee emp) {
		return dao.addNewUser(emp);
	}

	public List<Employee> listEmployee() {
        return dao.listEmployee();
    }

	@Override
	public void deleteEmployee(String dasID) {
		dao.deleteEmployee(dasID);
	}
/*
	@Override
	public Employee getEmployeeById(int eid) {
		return dao.getEmployeeById(eid);
	}
	*/
}
