package Homework_week_2;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

import java.util.Scanner;

public class Program18 {
    int A, B;

    public void calculation(int A, int B) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A : ");
        A = scanner.nextInt();
        System.out.println("Enter ");
        B = scanner.nextInt();
        System.out.println();
        System.out.println(A + " + " + B + " = " + (A+B));
        System.out.println(A + " - " + B + " = " + (A-B));
        System.out.println(A + " * " + B + " = " + (A*B));
        System.out.println(A + " / " + B + " = " + (A/B));
    }

    public static void main(String[] args) {
        Program18 program18 = new Program18();
        program18.calculation(program18.A, program18.B);

    }
}
