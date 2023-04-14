package com.example.springhw24.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + "+" + num2 + "=" + String.valueOf(sum);
    }
    public String minus(int num1, int num2) {

        int min = num1 - num2;
        return num1 + "-" + num2 + "=" + String.valueOf(min);
    }

    public String multiply(int num1, int num2) {

        int multip = num1 * num2;
        return num1 + "*" + num2 + "=" + String.valueOf(multip);
    }

    public String separate(int num1, int num2) {


        if (num2 == 0) {
            return "На 0 делить нельзя";
        }

        int divi = num1 / num2;
        return num1 + "/" + num2 + "=" + String.valueOf(divi);
    }
}

