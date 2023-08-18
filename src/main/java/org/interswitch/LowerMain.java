package org.interswitch;

import java.time.LocalDate;

public class LowerMain {
    public static void main(String[] args) {
        LowerToUpper lowerToUpper =new LowerToUpper();
        System.out.printf("%s to %s\n", "Hello Babe", lowerToUpper.responseInUpperCase("Hello Babe"));
        System.out.printf("%s to %s\n", "Hello", lowerToUpper.responseInLowerCase("Hello"));

        System.out.println("go hommmeeeeee"+ LocalDate.now());
    }
}
