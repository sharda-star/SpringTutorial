package com.xoriant.dao;

import java.util.List;

import com.xoriant.dto.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee employee);
	public void updateEmployee(int empId, double salary);
	public void deleteEmployee(int empId);
	public Employee getEmployee(int empId);
	public List<Employee> getAllEmployees();
}
