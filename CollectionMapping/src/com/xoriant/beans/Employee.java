package com.xoriant.beans;

import java.util.List;

public class Employee {
	private int empId;
	private String name;
	private List<String> technologyStack;
	private List<Address> addr;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTechnologyStack() {
		return technologyStack;
	}
	public void setTechnologyStack(List<String> technologyStack) {
		this.technologyStack = technologyStack;
	}
	
	public List<Address> getAddr() {
		return addr;
	}
	public void setAddr(List<Address> addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", technologyStack=" + technologyStack + ", addr=" + addr
				+ "]";
	}
	
	
}
