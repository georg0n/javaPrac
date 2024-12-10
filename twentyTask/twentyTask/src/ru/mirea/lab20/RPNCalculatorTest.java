package ru.mirea.lab20;

public class RPNCalculatorTest {

    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testDivisionByZero();
        testInvalidExpression();
    }

    public static void testAddition() {
        try {
            double result = RPNCalculator.evaluate("3 4 +");
            if (Math.abs(result - 7.0) < 0.0001) {
                System.out.println("testAddition passed");
            } else {
                System.out.println("testAddition failed: expected 7.0, but got " + result);
            }
        } catch (Exception e) {
            System.out.println("testAddition failed: " + e.getMessage());
        }
    }

    public static void testSubtraction() {
        try {
            double result = RPNCalculator.evaluate("3 4 -");
            if (Math.abs(result - (-1.0)) < 0.0001) {
                System.out.println("testSubtraction passed");
            } else {
                System.out.println("testSubtraction failed: expected -1.0, but got " + result);
            }
        } catch (Exception e) {
            System.out.println("testSubtraction failed: " + e.getMessage());
        }
    }

    public static void testMultiplication() {
        try {
            double result = RPNCalculator.evaluate("3 4 *");
            if (Math.abs(result - 12.0) < 0.0001) {
                System.out.println("testMultiplication passed");
            } else {
                System.out.println("testMultiplication failed: expected 12.0, but got " + result);
            }
        } catch (Exception e) {
            System.out.println("testMultiplication failed: " + e.getMessage());
        }
    }

    public static void testDivision() {
        try {
            double result = RPNCalculator.evaluate("3 2 /");
            if (Math.abs(result - 1.5) < 0.0001) {
                System.out.println("testDivision passed");
            } else {
                System.out.println("testDivision failed: expected 1.5, but got " + result);
            }
        } catch (Exception e) {
            System.out.println("testDivision failed: " + e.getMessage());
        }
    }

    public static void testDivisionByZero() {
        try {
            RPNCalculator.evaluate("3 0 /");
            System.out.println("testDivisionByZero failed: expected ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println("testDivisionByZero passed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("testDivisionByZero failed: " + e.getMessage());
        }
    }

    public static void testInvalidExpression() {
        try {
            RPNCalculator.evaluate("3 +");
            System.out.println("testInvalidExpression failed: expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            System.out.println("testInvalidExpression passed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("testInvalidExpression failed: " + e.getMessage());
        }
    }
}
