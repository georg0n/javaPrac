package ru.mirea.lab15.employeeGUI;

public class Employee {
    private String name;
    private double hourlyRate;
    private int workedHours;

    // Конструктор
    public Employee(String name, double hourlyRate, int workedHours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    // Метод для расчета заработной платы
    public double calculateSalary() {
        return hourlyRate * workedHours;
    }
}

