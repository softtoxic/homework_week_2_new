package Homework_week_2;
/**
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Program15 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first variable A : ");
        int A = scanner.nextInt();
        System.out.println("Enter second variable B : ");
        int B = scanner.nextInt();
        int swap;
        swap = A;
        A = B;
        B = swap;
        System.out.println("Swap variable is Swap :   A = " + A + " , B = " + B);



    }
}
