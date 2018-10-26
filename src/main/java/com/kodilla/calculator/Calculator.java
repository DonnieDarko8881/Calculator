package com.kodilla.calculator;

public class Calculator {

    private double a;
    private double b;
    private double total;
    private double difference;

    private double add(double a, double b) {
        total = a + b;
        return total;
    }

    private double add(double a, double b, double c){
        total = a + b + c;
        return total;
    }

    private double subtract(double a, double b) {
        difference = a - b;
        return difference;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("total of addition a + b = " + calculator.add(5,3));
        System.out.println("total of addition a + b + c = " + calculator.add(5,3,4));
        System.out.println("total of subtraction a - b = " + calculator.subtract(20.5, 5));
        System.out.println("\ndodanie pustego tekstu w celu sprawdzenia czy dodaje się zmiana na git");
    }
}
