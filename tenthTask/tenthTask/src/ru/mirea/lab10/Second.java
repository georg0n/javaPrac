package ru.mirea.lab10;

public class Second {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);  // Рекурсивный вызов с уменьшением на 1
        System.out.print(n + " ");  // Печать числа после рекурсивного вызова
    }

    public static void main(String[] args) {
        int n = 5;  // Пример значения n
        printNumbers(n);
    }
}
