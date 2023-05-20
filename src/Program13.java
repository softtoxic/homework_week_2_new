package Homework_week_2;
/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

import java.util.Scanner;

public class Program13 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A : ");
        double A = scanner.nextDouble();
        System.out.println("Enter number B : ");
        double B = scanner.nextDouble();
        System.out.println("Enter number C : ");
        double C = scanner.nextDouble();
        double Average = (A + B + C)/3;
        System.out.println("The average AVG = " + Average);
    }
}
