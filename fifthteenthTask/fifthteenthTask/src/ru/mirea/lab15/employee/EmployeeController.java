package ru.mirea.lab15.employee;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    // Конструктор
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    // Методы для получения и установки данных модели
    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate);
    }

    public double getEmployeeHourlyRate() {
        return model.getHourlyRate();
    }

    public void setEmployeeWorkedHours(int workedHours) {
        model.setWorkedHours(workedHours);
    }

    public int getEmployeeWorkedHours() {
        return model.getWorkedHours();
    }

    // Метод для расчета зарплаты и обновления представления
    public void updateView() {
        double salary = model.calculateSalary();
        view.printEmployeeDetails(model.getName(), salary);
    }
}
