package com.xoriant.beans;

import java.util.Map;

public class Account {
	private String accountName;
	private Map<Integer, Project> projects;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Map<Integer, Project> getProjects() {
		return projects;
	}
	public void setProjects(Map<Integer, Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", projects=" + projects + "]";
	}
	
	
}
