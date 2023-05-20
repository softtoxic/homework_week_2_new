package Homework_week_2;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */

public class Program7 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter F : ");
        float F = scanner.nextFloat();
        float C = (F -32) * 5 / 9;
        System.out.println("Temperature is : " + C);
    }
}
