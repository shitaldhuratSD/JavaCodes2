package com.tyss.ustty.framework.service;

import java.util.List;

import com.tyss.ustty.framework.dto.Employee;


public interface EmployeeService {
	public boolean addEmployee(Employee employee);
	public boolean removeEmployee(int id);
	public boolean modifyEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List <Employee> getAllEmployee();
	public List<Employee> getEmployeeByName(String name);
	//public void updateEmployee(String name, String password, int id);
	
}
