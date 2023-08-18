package org.interswitch;

public class LowerMain {
    public static void main(String[] args) {
        LowerToUpper lowerToUpper =new LowerToUpper();
        System.out.printf("%s to %s\n", "Hello Babe", lowerToUpper.responseInUpperCase("Hello Babe"));
        System.out.printf("%s to %s\n", "Hello", lowerToUpper.responseInLowerCase("Hello"));
    }
}
