package com.example.bookapp.model;

public class Calculator {
    private double num1;
    private double num2;
    private String operation;
    private String result;

    public Calculator() {}

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void calculate() {
        result = switch (operation) {
            case "add" -> String.valueOf(num1 + num2);
            case "subtract" -> String.valueOf(num1 - num2);
            case "multiply" -> String.valueOf(num1 * num2);
            case "divide" -> num2 == 0 ? "Cannot divide by 0" : String.valueOf(num1 / num2);
            default -> "Invalid operation";
        };
    }
}
