package com.xoriant.beans;

public class Performer {
	public void perform() throws Exception {
		System.out.println("Performer performs........");
		throw new Exception();
	}
}
