package com.FirstJavaSteps;

public class Main {

    public static void main(String[] args) {
        // casting hierarchy
        // byte > short > int > long > float > double

        short   x = 1;
	    int     y = x + 2;

	    double a = 1.1;
	    double b = a + 2;

	    // 2 is an integer and variable a is double...a decimal which is more precise
	    // Implicit casting happens when a operand of a lower precise data type is in a expression
        // With a higher precise data type, and that result is being stored into a higher precise data type.
        // Implicit cast up...behind the scene Java is converting for us somewhere in memory so we don't have to!

        double  k = 3.1;
        int     j = (int)k + 2;

        // Explicit casting only happens with compatible types:
        // Byte > short > int > long > float > double
        // Cannot cast a string to a integer. They are not compatible

        String userInput = "1.1";
        double f = Double.parseDouble(userInput) + 8;

        // Wrapper classes and the appropriate member are needed to convert string to a integer.
        // Double is a wrapper class, and parseDouble() is the member that does the conversing

        System.out.println(y);
        System.out.println(b);
        System.out.println(j);
        System.out.println(f);
    }
}
