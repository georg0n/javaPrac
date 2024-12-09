package ru.mirea.lab3;

public class TestAuthor {
    public static void main(String[] args){
        Author b1 = new Author("Sergey", "sergey@yandex.ru", 'M');
        System.out.println(b1);
        b1.setEmail("sergey123@gmail.com");
        System.out.println(b1);
    }
}
