package ru.mirea.lab16;

import java.util.Scanner;

public class ThrowsDemo7 {
    public void getKey() throws Exception {  // Добавлено throws Exception
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) throws Exception {  // Добавлено throws Exception
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {  // Добавлено throws Exception
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo8 demo = new ThrowsDemo8();
        try {
            demo.getKey();  // Обработка исключений в main
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

/*Метод getKey() теперь заявляет о том, что он может выбросить исключение, добавив throws Exception в его сигнатуру. Это заставляет компилятор ожидать обработки исключений в вызвавших методах.

Метод printDetails() теперь также объявляет throws Exception, так как в нем вызывается метод getDetails(), который выбрасывает исключение.

В main добавлен блок try-catch, чтобы перехватить исключение, если оно пробрасывается из цепочки вызовов.

Итог
Когда мы добавляем обработку исключений в программу с помощью блоков try-catch или с помощью ключевого слова throws, программа компилируется и работает корректно. Важно, чтобы каждый метод, который может выбросить проверяемое исключение (например, Exception), либо обрабатывал его в блоке try-catch, либо сообщал о возможности выбрасывания исключения через throws.*/