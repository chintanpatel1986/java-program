package com.excellence.fundamentals;

public class Variables {

    // Static Variable
    static String collegeName = "IIT";

    // Instance Variable
    int rollNumber = 101;

    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println("Static Variable College Name is : " + Variables.collegeName);
        System.out.println("Instance Variable Roll Number is : " + variables.rollNumber);
        variables.localMethod();
    }

    public void localMethod() {
        // Local Variable
        String name = "Chintan";
        System.out.println("Local Variable Name is : " + name);
    }
}
