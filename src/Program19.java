package Homework_week_2;
/**
 * Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */

import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter upper case : ");
        String input = scanner.nextLine();

        String lowercase = input.toLowerCase();

        System.out.println("Lowercase is : " + lowercase);

        scanner.close();
    }
}
