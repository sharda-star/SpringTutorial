package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.xoriant.beans.Employee;
import com.xoriant.beans.Project;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Employee emp = (Employee) context.getBean("emp1");
//		System.out.println(emp);
		
		Project project1 = (Project) context.getBean("project1");
		System.out.println(project1);
	}
}
