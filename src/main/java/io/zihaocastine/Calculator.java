package io.zihaocastine;

/**
 * Created by zihaocastine on 5/17/16.
 */
public class Calculator {
    public static int add(int num1, int num2){
        return num1+num2;

    }

    public static int subtract(int num1 , int num2){
        return num1-num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static double divide(int num1, int num2)throws ArithmeticException{
        double total=0;
        total= num1/num2;
        return total;
    }


}