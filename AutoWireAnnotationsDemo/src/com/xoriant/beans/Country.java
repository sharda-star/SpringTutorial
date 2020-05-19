package com.xoriant.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {
	private String countryName;
	private State state;
	@Autowired
	public Country(String countryName, State state) {
		super();
		this.countryName = countryName;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", state=" + state + "]";
	}
}
