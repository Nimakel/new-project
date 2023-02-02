package com.newproject.utils;

public class Calculator {

    public double calculate(double num1, String meth, double num2){
        switch (meth) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "/": return num1 / num2;
            case "*": return num1 * num2;
            default: return 0;
        }
    }
}
