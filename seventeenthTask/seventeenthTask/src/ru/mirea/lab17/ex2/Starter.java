package ru.mirea.lab17.ex2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("ФИО", 68, 12, 18));
        s.add(new Student("ФИО2", 75, 12, 18));
        s.add(new Student("ФИО3", 93, 12, 19));
        s.add(new Student("ФИО4", 44, 2, 18));
        s.add(new Student("ФИО5", 66, 12, 18));

        new LabClassUI(s);
    }

}