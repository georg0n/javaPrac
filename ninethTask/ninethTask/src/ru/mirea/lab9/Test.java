package ru.mirea.lab9;

public class Test {
    public static void main(String[] args) {

        Nameable earth = new Planet("Earth");
        Nameable ferrari = new Car("Ferrari");
        Nameable lion = new Animal("Lion");


        System.out.println("Planet: " + earth.getName());
        System.out.println("Car: " + ferrari.getName());
        System.out.println("Animal: " + lion.getName());
    }
}