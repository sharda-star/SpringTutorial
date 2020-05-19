package com.xoriant.client;

import com.xoriant.beans.Address;
import com.xoriant.beans.Person;

public class Client {
	public static void main(String[] args) {
		Person person = new Person();
		
		Address address = new Address();
		address.setCity("Pune");
		person.setName("Nisha");
		person.setAddress(address);
		System.out.println(person);
	}
}
