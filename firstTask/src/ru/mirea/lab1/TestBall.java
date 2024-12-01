package ru.mirea.lab1;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball("Yellow", 200);
        Ball b2 = new Ball("Blue", 300);
        Ball b3 = new Ball("Pink"); b3.setWeight(500);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
