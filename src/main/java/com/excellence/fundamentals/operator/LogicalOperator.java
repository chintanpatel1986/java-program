package com.excellence.fundamentals.operator;

public class LogicalOperator {
    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;
        int numberThree = 30;

        System.out.println((numberOne < numberTwo) && (++numberOne < numberThree));
        System.out.println((numberOne > numberTwo) || (++numberOne < numberThree));
        System.out.println(!(numberOne > numberTwo));
        System.out.println(!(numberOne < numberTwo));
    }
}
