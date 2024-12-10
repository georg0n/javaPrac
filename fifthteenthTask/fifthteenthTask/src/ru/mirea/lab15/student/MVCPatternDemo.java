package ru.mirea.lab15.student;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Создание модели
        Student student = retriveStudentFromDatabase();

        // Создание представления
        StudentView studentView = new StudentView();

        // Создание контроллера
        StudentController studentController = new StudentController(student, studentView);

        // Отображение информации о студенте
        studentController.updateView();

        // Обновление данных студента через контроллер
        studentController.setStudentName("John Doe");
        studentController.setStudentRollNo("10");

        // Отображение обновленной информации
        studentController.updateView();
    }

    // Метод для имитации получения данных студента из базы данных
    private static Student retriveStudentFromDatabase() {
        // Создаем студента с заранее заданными данными
        return new Student("1", "Robert");
    }
}
