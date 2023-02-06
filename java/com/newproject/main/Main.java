package com.newproject.main;

import com.newproject.utils.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner input = new Scanner(System.in);

        Calculator calculator = new Calculator();
        double result = calculator.calculate(input.nextDouble(), input.next(), input.nextDouble());

        System.out.println(result);

    }

}
