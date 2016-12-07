package com.atos.services;

import java.util.List;

import com.atos.pojo.Employee;

public interface EmpService {
	Employee getValidateUser(Employee emp);
	boolean getRegisterCustomer(Employee emp);
	public List<Employee> listEmployee();
	public void deleteEmployee(String dasID);
	//Employee getEmployeeById(int eid);
}
