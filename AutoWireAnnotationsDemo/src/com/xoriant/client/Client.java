package com.xoriant.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xoriant.beans.Country;
import com.xoriant.beans.State;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Country country = context.getBean(Country.class);
		System.out.println(country);
	}
}
