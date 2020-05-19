package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.beans.Address;
import com.xoriant.beans.Person;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person p =  (Person) context.getBean("person");
		p.display();
		System.out.println(p);
		
		p = (Person) context.getBean("person1");
		System.out.println(p);
		
		
	}
}
