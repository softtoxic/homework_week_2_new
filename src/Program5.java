package Homework_week_2;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods
 */

import java.util.Scanner;

public class Program5 {
    //instance variables
    int A, B;
    // instance method
    public void addition(int A, int B){

        int sum = A + B;
        System.out.println("Sum of two number is : " + sum);
    }
    public void subtraction(int A, int B){
        int sub = A - B;
        System.out.println("Sub of two number is : " + sub);

    }
    //static method
    public static void multiplication(int A, int B){
        int mul = A * B;
        System.out.println("Mul of two number is : " + mul);

    }
    public static void division (int A, int B){
        int div = A / B;
        System.out.println("Div of two number is : " + div);

    }
// main method
    public static void main(String[] args){
//creation of object
        Program5 program5 = new Program5();
        //input syntax

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A : ");
        program5.A = scanner.nextInt();
        System.out.println("Enter B : ");
        program5.B = scanner.nextInt();
        //calling instance method c
        program5.addition(program5.A, program5.B);
        program5.subtraction(program5.A, program5.B);
        // calling static method
        multiplication(program5.A, program5.B);
        division(program5.A, program5.B);

    }

}
