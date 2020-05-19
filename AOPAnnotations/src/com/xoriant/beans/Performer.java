package com.xoriant.beans;

import org.springframework.stereotype.Component;

@Component("performer")
public class Performer {
	public Performer() {
		// TODO Auto-generated constructor stub
	}
	public void perform()  {
		System.out.println("Performer performs........");
	}
}
