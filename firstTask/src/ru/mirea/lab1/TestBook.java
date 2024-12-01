package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Lermontov", 100);
        Book b2 = new Book("Pelevin", 3000);
        Book b3 = new Book("Bulgakov"); b3.setPages(1143);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

