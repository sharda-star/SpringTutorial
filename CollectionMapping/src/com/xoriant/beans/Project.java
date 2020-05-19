package com.xoriant.beans;

import java.util.Set;

public class Project {
	private int projectId;
	private String projectName;
	private Set<Employee> employees;
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", employees=" + employees + "]";
	}
	
	
}
