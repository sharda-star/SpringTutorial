package com.xoriant.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class State {
	private String stateName;
	private District district;
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public District getDistrict() {
		return district;
	}
	
	@Autowired
	@Qualifier("district1")
	public void setDistrict(District district) {
		System.out.println("setter for district");
		this.district = district;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", district=" + district + "]";
	}
	
	
	
}
