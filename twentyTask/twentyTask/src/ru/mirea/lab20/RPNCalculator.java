package ru.mirea.lab20;

import java.util.Stack;

public class RPNCalculator {

    public static double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();

        // Разделяем выражение по пробелам
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    if (stack.size() < 2) {
                        throw new IllegalArgumentException("Недостаточно операндов для операции +");
                    }
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    if (stack.size() < 2) {
                        throw new IllegalArgumentException("Недостаточно операндов для операции -");
                    }
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    if (stack.size() < 2) {
                        throw new IllegalArgumentException("Недостаточно операндов для операции *");
                    }
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a * b);
                    break;
                case "/":
                    if (stack.size() < 2) {
                        throw new IllegalArgumentException("Недостаточно операндов для операции /");
                    }
                    b = stack.pop();
                    a = stack.pop();
                    if (b == 0) {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    stack.push(a / b);
                    break;
                default:
                    try {
                        // Пытаемся преобразовать строку в число
                        stack.push(Double.parseDouble(token));
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Неизвестный токен: " + token);
                    }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        // Пример использования
        String expression = "3 4 + 2 * 7 /"; // (3 + 4) * 2 / 7
        double result = evaluate(expression);
        System.out.println("Результат: " + result);
    }
}
