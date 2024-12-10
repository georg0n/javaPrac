package ru.mirea.lab15.employeeGUI;

import javax.swing.*;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создание модели
        Employee employee = new Employee("", 0, 0);

        // Создание представления
        EmployeeView view = new EmployeeView();

        // Создание контроллера
        EmployeeController controller = new EmployeeController(employee, view);

        // Настройка и запуск GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = view.getFrame(); // Получаем доступ к фрейму через геттер
            frame.setVisible(true);
        });
    }
}


