package com.example.mp42;

/*
 CSCE 489: Machine Problem#2
 Srishti Kumar
 Description: This user-driven program simulates a basic Calculator.
 */

public class Calculator {

    private String operator;
    private float arg1;
    private float arg2;
    private float answer;
    public boolean flag = false;

    public Calculator() {
        this.operator = "";
//        this.arg1 = (float) -1.0;
//        this.arg2 = (float) -1.0;
        this.arg1 = (float)Double.POSITIVE_INFINITY;
        this.arg2 = (float)Double.POSITIVE_INFINITY;
        this.answer = (float)0.0;;
    }

    public void clear()
    {
        operator = "";
        arg1 = (float) Double.POSITIVE_INFINITY;
        arg2 = (float)Double.POSITIVE_INFINITY;
        answer = (float)0.0;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public float getArg1() {
        return arg1;
    }

    public void setArg1(float arg1) {
        this.arg1 = arg1;
    }

    public float getArg2() {
        return arg2;
    }

    public void setArg2(float arg2) {
        this.arg2 = arg2;
    }

    public float getAnswer() {
        return answer;
    }

    // Only accessible by calculation functions below!
    private void setAnswer(float answer) {
        this.answer = answer;
    }

    public Float addition(Float A, Float B) // Add
    {
//        System.out.println("The sum of " + A + " and " + B + " is " + (A + B));
        setAnswer(A+B);
        return answer;
    }

    public Float subtraction(Float A, Float B) // Subtract
    {
//        System.out.println("The difference of " + A + " and " + B + " is " + (A - B));
        setAnswer(A-B);
        return answer;
    }

    public Float multiplication(Float A, Float B) // Multiply
    {
//        System.out.println("The product of " + A + " and " + B + " is " + (A * B));
        setAnswer(A*B);
        return answer;
    }

    public Float division(Float A, Float B) // Multiply
    {
//        System.out.println("The product of " + A + " and " + B + " is " + (A * B));
        setAnswer(A/B);
        return answer;
    }

}

