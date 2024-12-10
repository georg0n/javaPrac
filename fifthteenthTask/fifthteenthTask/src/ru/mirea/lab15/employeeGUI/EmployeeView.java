package ru.mirea.lab15.employeeGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;  // Импортируем ActionListener

public class EmployeeView {
    private JFrame frame;
    private JTextField nameField;
    private JTextField hourlyRateField;
    private JTextField workedHoursField;
    private JButton calculateButton;
    private JLabel salaryLabel;

    // Конструктор для инициализации GUI
    public EmployeeView() {
        frame = new JFrame("Employee Salary Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Создание полей для ввода данных
        frame.add(new JLabel("Employee Name:"));
        nameField = new JTextField(20);
        frame.add(nameField);

        frame.add(new JLabel("Hourly Rate:"));
        hourlyRateField = new JTextField(10);
        frame.add(hourlyRateField);

        frame.add(new JLabel("Worked Hours:"));
        workedHoursField = new JTextField(10);
        frame.add(workedHoursField);

        // Кнопка для расчета зарплаты
        calculateButton = new JButton("Calculate Salary");
        frame.add(calculateButton);

        // Метка для отображения расчета зарплаты
        salaryLabel = new JLabel("Salary: $0.00");
        frame.add(salaryLabel);

        // Настроим видимость фрейма
        frame.setVisible(true);
    }

    // Геттеры для получения данных из GUI
    public String getEmployeeName() {
        return nameField.getText();
    }

    public double getHourlyRate() {
        return Double.parseDouble(hourlyRateField.getText());
    }

    public int getWorkedHours() {
        return Integer.parseInt(workedHoursField.getText());
    }

    // Метод для обновления отображения зарплаты
    public void setSalaryLabel(double salary) {
        salaryLabel.setText("Salary: $" + salary);
    }

    // Метод для добавления обработчика события кнопки
    public void addCalculateButtonListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }

    // Геттер для получения фрейма
    public JFrame getFrame() {
        return frame;
    }
}

