package ru.mirea.lab22.task2;

public class MAGIC implements Chair {
    @Override
    public void sit(Chair chair) {
        System.out.println("Это MAGIC");
    }

    @Override
    public String GetType() {
        return "magic";
    }
}