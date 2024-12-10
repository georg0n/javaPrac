package ru.mirea.lab15.employee;

public class EmployeeView {
    public void printEmployeeDetails(String employeeName, double salary) {
        System.out.println("Employee: ");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: $" + salary);
    }
}
