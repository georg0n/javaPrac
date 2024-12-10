package ru.mirea.lab15.employee;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создание модели
        Employee employee = retriveEmployeeFromDatabase();

        // Создание представления
        EmployeeView employeeView = new EmployeeView();

        // Создание контроллера
        EmployeeController employeeController = new EmployeeController(employee, employeeView);

        // Отображение информации о сотруднике и его зарплаты
        employeeController.updateView();

        // Обновление данных сотрудника через контроллер
        employeeController.setEmployeeName("John Doe");
        employeeController.setEmployeeHourlyRate(25.5);
        employeeController.setEmployeeWorkedHours(160);

        // Отображение обновленной информации
        employeeController.updateView();
    }

    // Метод для имитации получения данных сотрудника из базы данных
    private static Employee retriveEmployeeFromDatabase() {
        // Создаем сотрудника с заранее заданными данными
        return new Employee("Robert", 20.0, 160);
    }
}