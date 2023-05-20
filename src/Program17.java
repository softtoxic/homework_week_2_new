package Homework_week_2;
/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 */

import java.util.Scanner;


public class Program17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Decimal number : ");
        int Dec = scanner.nextInt();
        String binary = " ";
        while (Dec > 0){
            binary = (Dec  % 2) + binary;
            Dec /=2;
        }
        System.out.println("Binary number is : " + binary);
    }
}
