package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.println("Enter The number for one side " );
        float a = dd.nextFloat();
        System.out.println("Enter the number for the other side ");
        float b = dd.nextFloat();

        System.out.println( "The area of the rectangle is " + a * b );
        System.out.println( "The length of the diagonal " +  Math.sqrt(a) + Math.sqrt(b));
    }
}
