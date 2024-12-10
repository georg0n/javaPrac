package ru.mirea.lab10;

public class First {
    public static void printSequence(int n) {
        int currentNumber = 1;  // Текущее число в последовательности
        int count = 0;  // Счётчик выведенных чисел

        // Внешний цикл для перебора чисел от 1 и дальше
        for (int i = 1; count < n; i++) {
            // Внутренний цикл для вывода текущего числа i столько раз, сколько оно равно
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Пример значения n
        printSequence(n);
    }
}
