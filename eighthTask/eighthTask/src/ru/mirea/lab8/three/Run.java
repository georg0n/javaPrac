package ru.mirea.lab8.three;

public class Run {
    public static void main(String[] args) {
        App app = new App();
        Thread animation = new Thread(app);
        animation.start();
    }
}
