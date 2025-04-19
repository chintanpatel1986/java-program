package com.excellence.fundamentals.operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int numberOne = 15;
        int numberTwo = 30;

        System.out.println("The value of numberOne & numberTwo is : " + (numberOne & numberTwo));
        System.out.println("The value of numberOne | numberTwo is : " + (numberOne | numberTwo));
        System.out.println("The value of numberOne ^ numberTwo is : " + (numberOne ^ numberTwo));
        System.out.println("The value of ~numberOne is : " + (~numberOne));
    }
}
