package org.interswitch;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("input first number: ");
        int a = input.nextInt();
        System.out.println("input second number: ");
        int b = input.nextInt();

        int choice = 0;
        System.out.println("Enter 1 to add the numbers\n" +
                "2 to subtract the numbers\n" +
                "3 to divide the numbers\n" +
                "4 to multiply the numbers\n");
        choice = input.nextInt();
        switch(choice) {
            case 1:calculator.add(a,b);
                break;
            case 2:calculator.sub(a,b);
                break;
            case 3:calculator.div(a,b);
                break;
            case 4:calculator.mult(a,b);
                break;
        }
    }
}
