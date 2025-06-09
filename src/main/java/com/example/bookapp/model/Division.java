package com.example.bookapp.model;

public class Division {
    private int num1;
    private int num2;
    private String result;

    public Division() {}

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getResult() {
        return result;
    }

    public void calculate() {
        try {
            int res = num1 / num2;
            result = String.valueOf(res);
        } catch (ArithmeticException e) {
            result = "Cannot divide by zero!";
        }
    }
}
