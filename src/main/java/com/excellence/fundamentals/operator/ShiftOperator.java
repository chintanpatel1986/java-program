package com.excellence.fundamentals.operator;

public class ShiftOperator {
    public static void main(String[] args) {

        // Left Shift Operator

        System.out.println("Left Shift Operator :");
        System.out.println(30<<2);
        System.out.println(20<<3);
        System.out.println(10<<4);
        System.out.println(15<<4);

        System.out.println();

        // Right Shift Operator

        System.out.println("Right Shift Operator :");
        System.out.println(20>>2);
        System.out.println(10>>3);
        System.out.println(15>>4);
        System.out.println(15>>3);

        System.out.println();

        // Right Shift VS Unsigned Right Shift Operator

        System.out.println("Right Shift VS Unsigned Right Shift Operator :");
        System.out.println(30>>3);
        System.out.println(30>>>3);

        System.out.println(-30>>3);
        System.out.println(-30>>>3);

    }
}
