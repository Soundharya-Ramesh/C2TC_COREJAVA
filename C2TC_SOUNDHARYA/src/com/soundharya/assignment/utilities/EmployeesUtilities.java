package com.soundharya.assignment.utilities;
import com.soundharya.assignment.employees.Employee;
import com.soundharya.assignment.employees.Manager;
import com.soundharya.assignment.employees.Developer;

/**
 * Provides utility methods for employee operations.
 */
public class EmployeesUtilities {

    /**
     * Displays details of an employee.
     * 
     * @param employee The employee whose details are to be displayed.
     */
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        if (employee instanceof Manager) {
            System.out.println("Department: " + ((Manager) employee).getDepartment());
        } else if (employee instanceof Developer) {
            System.out.println("Programming Language: " + ((Developer) employee).getProgrammingLanguage());
        }
    }

    /**
     * Increases the salary of an employee by a specified percentage.
     * 
     * @param employee The employee whose salary is to be increased.
     * @param percentage The percentage increase.
     */
    public void increaseSalary(Employee employee, double percentage) {
        double newSalary = employee.getSalary() + (employee.getSalary() * (percentage / 100));
        employee.setSalary(newSalary);
    }
}


	
