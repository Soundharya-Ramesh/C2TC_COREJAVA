package com.tns.ifet.day5;

public class Manager extends Employee {
	private int teamSize;

public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, int employeeId, String department) {
		super(name, employeeId, department);
		// TODO Auto-generated constructor stub
	}

public Manager(String name, int employeeId, String department, int teamSize) {
	super(name, employeeId, department);
	this.teamSize = teamSize;
}
public int getTeamSize() {
	return teamSize;
}
public void setTeamSize(int teamSize) {
	this.teamSize = teamSize;
}
@Override
public String toString() {
	return "Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId()
	+ ", Department=" + getDepartment() + "]";
}}
