package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.dao.EmployeeDAO;
import com.xoriant.dto.Employee;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeDAO dao = (EmployeeDAO) context.getBean("empDAO");
		Employee employee = new Employee(1, "Ram", 123456);
		dao.addEmployee(employee);
	}
}
