package com.xoriant.beans;

public class Country {
	private String countryName;
	private State state;
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
