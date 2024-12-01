package ru.mirea.lab1;

public class Ball {
    private String color;
    private int weight;
    public Ball(String c, int w){
        color = c;
        weight = w;
    }
    public Ball(String c){
        color = c;
        weight = 1;
    }
    public Ball(){
        color = "Red";
        weight = 1;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(String color){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public String toString(){
        return this.color+" color, "+this.weight+" weight";
    }
}
