package ru.mirea.lab9.two;

public class Subscription implements Priceable {
    private String type;
    private double monthlyFee;

    public Subscription(String type, double monthlyFee) {
        this.type = type;
        this.monthlyFee = monthlyFee;
    }

    @Override
    public double getPrice() {
        return monthlyFee;
    }

    public String getType() {
        return type;
    }
}
