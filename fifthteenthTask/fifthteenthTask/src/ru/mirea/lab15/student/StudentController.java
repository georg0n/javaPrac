package ru.mirea.lab15.student;

public class StudentController {
    private Student model;
    private StudentView view;

    // Конструктор
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Методы для получения и установки данных модели
    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    // Метод для обновления представления
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
