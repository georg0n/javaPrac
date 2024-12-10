package ru.mirea.lab16;

import java.util.Scanner;

public class ThrowsDemo8 {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = null;

        // Цикл для получения правильного ключа от пользователя
        while (true) {
            try {
                System.out.print("Введите ключ: ");
                key = myScanner.next();

                // Проверка на пустой ключ
                if (key.equals("")) {
                    throw new Exception("Ключ не может быть пустым.");
                }

                // Если ключ введен корректно, выходим из цикла
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте ввести ключ снова.");
            }
        }

        // После того как ключ введен корректно, вызываем printDetails
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Ошибка при обработке данных: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {  // Теперь метод может выбрасывать Exception
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        // Если ключ пустой, выбрасываем исключение
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


/*Удаление throws Exception из метода getKey(): Мы убрали throws Exception из метода getKey(), поскольку теперь все исключения будут обрабатываться в этом методе с помощью блока try-catch.

Блок try-catch в методе getKey(): В методе getKey() теперь есть блок try-catch, который:

Попробует получить ключ от пользователя.
Если ключ пустой (пользователь введет пустую строку), выбросит исключение с сообщением "Ключ не может быть пустым."
Если возникает исключение, оно будет поймано в блоке catch, и пользователю будет предложено ввести значение еще раз.
Цикл для повторного ввода: Использован цикл while (true), который продолжает запрашивать ввод, пока не будет введен корректный ключ. Если ключ пустой, исключение будет перехвачено, и программа попросит пользователя ввести значение снова.

Метод printDetails: Этот метод вызывает getDetails(key) для вывода данных по ключу. Если в getDetails() возникает исключение, оно пробрасывается дальше.

Обработка исключений в main(): В методе main() добавлен блок try-catch, чтобы перехватить исключения, которые могут быть выброшены в любом из методов (например, при неверном вводе пользователем).*/
