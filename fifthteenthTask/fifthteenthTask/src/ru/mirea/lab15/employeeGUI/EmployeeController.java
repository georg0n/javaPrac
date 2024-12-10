package ru.mirea.lab15.employeeGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    // Конструктор
    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;

        // Добавляем слушателя события для кнопки "Calculate Salary"
        this.view.addCalculateButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSalary();
            }
        });
    }

    // Метод для расчета заработной платы
    private void calculateSalary() {
        model.setName(view.getEmployeeName());
        model.setHourlyRate(view.getHourlyRate());
        model.setWorkedHours(view.getWorkedHours());

        double salary = model.calculateSalary();
        view.setSalaryLabel(salary);
    }
}

