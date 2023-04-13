package com.example.springhw24;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int plus(Integer num1, Integer num2) {
        if (num1.equals(null) || num2.equals(null)) {
            throw new IllegalArgumentException("не хватает аргумента для вычисления");
        }
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double separate(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 невозможно");
        }
        return (double) num1 / num2;
    }
}