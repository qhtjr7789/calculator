package com.example.calculator;

public class Calculator {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int division(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
    }

    public double divisionx(double a, double b) {
        try {
            double result = a / b;
            return result;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }

    }
}

