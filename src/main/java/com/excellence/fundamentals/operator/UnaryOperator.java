package com.excellence.fundamentals.operator;

public class UnaryOperator {
    public static void main(String[] args) {
        int numberOne = 10;
        int numberTwo = -30;
        boolean booleanOne = true;
        boolean booleanTwo = false;

        System.out.println(numberOne++);
        System.out.println(++numberOne);
        System.out.println(numberOne--);
        System.out.println(--numberOne);

        System.out.println();

        System.out.println(~numberOne);
        System.out.println(~numberTwo);
        System.out.println(!booleanOne);
        System.out.println(!booleanTwo);
    }
}
