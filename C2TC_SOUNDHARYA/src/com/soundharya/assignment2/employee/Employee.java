package com.soundharya.assignment2.employee;

public class Employee  {
	    private int employeeId;
	    private String name;
	    private String department;

	    // Constructor
	    public Employee(int employeeId, String name, String department) {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.department = department;
	    }

	    // Getter methods
	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    // Display method
	    public void displayDetails() {
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	    }
	}


