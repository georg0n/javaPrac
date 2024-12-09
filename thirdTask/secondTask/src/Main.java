import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1. Сумма чисел массива
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //  for
        int sumFor = 0;
        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }
        System.out.println("Сумма с помощью for: " + sumFor);

        // while
        int sumWhile = 0;
        int i = 0;
        while (i < array.length) {
            sumWhile += array[i];
            i++;
        }
        System.out.println("Сумма с помощью while: " + sumWhile);

        // do-while
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += array[j];
            j++;
        } while (j < array.length);
        System.out.println("Сумма с помощью do-while: " + sumDoWhile);

        // 2. Вывести на экран аргументы командной строки в цикле for.
        System.out.println("\nАргументы командной строки:");
        for (String arg : args) {
            System.out.println(arg);
        }

        // 3. Вывести на экран первые 10 чисел гармонического ряда.
        System.out.println("\nПервые 10 чисел гармонического ряда:");
        for (int n = 1; n <= 10; n++) {
            double harmonicNumber = 1.0 / n;
            System.out.println("H(" + n + ") = " + harmonicNumber);
        }

        // 4. Сгенерировать массив целых чисел случайным образом, отсортировать его и вывести.
        Random random = new Random();
        int[] randomArray = new int[10];
        for (int k = 0; k < randomArray.length; k++) {
            randomArray[k] = random.nextInt(100); // случайные числа от 0 до 99
        }

        System.out.println("\nСгенерированный массив:");
        System.out.println(Arrays.toString(randomArray));

        Arrays.sort(randomArray);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(randomArray));

        // 5. Метод для вычисления факториала числа с помощью цикла.
        System.out.println("\nФакториал числа 5: " + factorial(5));
    }

    // Метод для вычисления факториала
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}