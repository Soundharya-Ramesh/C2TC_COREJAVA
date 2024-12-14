package com.soundharya.assignment;
import com.soundharya.assignment.employees.Manager;
import com.soundharya.assignment.employees.Developer;
public class AssignmentMain{
public static void main(String[] args) {
    // Create instances of Manager and Developer
    Manager manager = new Manager("Ram", 101, 90000, "IT");
    Developer developer = new Developer("Krish", 102, 75000, "Java");

    // Create an instance of EmployeeUtilities
    com.soundharya.assignment.utilities.EmployeesUtilities utilities = new com.soundharya.assignment.utilities.EmployeesUtilities();

    // Display details of employees
    System.out.println("Manager Details:");
    utilities.displayEmployeeDetails(manager);

    System.out.println("\nDeveloper Details:");
    utilities.displayEmployeeDetails(developer);

    // Increase salary
    utilities.increaseSalary(manager, 10); // 10% increase
    utilities.increaseSalary(developer, 15); // 15% increase

    // Display updated details
    System.out.println("\nUpdated Manager Details:");
    utilities.displayEmployeeDetails(manager);

    System.out.println("\nUpdated Developer Details:");
    utilities.displayEmployeeDetails(developer);
}
}

