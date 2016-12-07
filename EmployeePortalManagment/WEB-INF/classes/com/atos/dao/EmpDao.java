package com.atos.dao;

import java.util.List;

import com.atos.pojo.Employee;

public interface EmpDao {
	Employee validateUser(Employee emp);

	boolean addNewUser(Employee emp);

	public List<Employee> listEmployee();

	public void deleteEmployee(String dasID);

	//Employee getEmployeeById(int eid);
}
