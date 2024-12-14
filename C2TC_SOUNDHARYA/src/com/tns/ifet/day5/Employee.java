package com.tns.ifet.day5;

public class Employee {
	private String name;
	private String department;
	private int employeeId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int employeeId, String department) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}

