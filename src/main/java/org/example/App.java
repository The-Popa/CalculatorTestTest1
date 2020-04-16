package org.example;

/*
The Calculator class provides static methods for
arithmetic operations on two integers.
 */

public class App 
{
    public static class Calculator {
    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    // Integer divide. Return a truncated int.
    public static int division(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return (int) ((double) number1 / number2);
    }

}

}
