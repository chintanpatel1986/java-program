package com.excellence.fundamentals.operator;

public class TernaryOperator {
    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;
        int numberThree = 30;

        int min = (numberOne < numberTwo) ? numberOne : numberTwo;
        System.out.println("The minimum value is : " + min);

        System.out.println();

        int max = (numberOne > numberTwo) ? (numberOne > numberThree ? numberOne : numberThree) : (numberTwo > numberThree ? numberTwo : numberThree);
        System.out.println("The maximum value is : " + max);
    }
}
