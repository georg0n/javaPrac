package ru.mirea.lab10;

public class Third {
    public static void printRange(int A, int B) {

        if (A <= B) {
            System.out.print(A + " ");
            if (A < B) {
                printRange(A + 1, B);
            }
        }

        else if (A > B) {
            System.out.print(A + " ");
            if (A > B) {
                printRange(A - 1, B);
            }
        }
    }

    public static void main(String[] args) {
        int A = 1, B = 5;
        printRange(A, B);
        System.out.println();

        A = 5;
        B = 1;  // Пример для убывающего порядка
        printRange(A, B);
    }
}
