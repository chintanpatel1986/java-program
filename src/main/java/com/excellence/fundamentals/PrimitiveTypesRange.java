package com.excellence.fundamentals;

public class PrimitiveTypesRange {
    public static void main(String[] args) {

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Range : " + minByteValue + " - " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Range : " + minShortValue + " - " + maxShortValue);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Range : " + minIntValue + " - " + maxIntValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Range : " + minLongValue + " - " + maxLongValue);

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Range : " + minFloatValue + " - " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Range : " + minDoubleValue + " - " + maxDoubleValue);

        char minCharValue = Character.MIN_VALUE;
        char maxCharValue = Character.MAX_VALUE;
        System.out.println("Character Range : " + (int) minCharValue + " - " + (int) maxCharValue);
    }
}
