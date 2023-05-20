package Homework_week_2;
/**
 * Write a Java program to add two binary numbers.
 */

import java.util.Scanner;

public class Program16 {

        long b1= 0;
        long b2= 0;
        public static void m1(){

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the first binary numbers ="); //10
            String b1 = sc.nextLine();
            System.out.println("enter the second binary numbers =");//11
            String b2 = sc.nextLine();
            int num1 = Integer.parseInt(b1,2);
            int num2 = Integer.parseInt(b2,2);
            int ans = num1 + num2 ;
            System.out.println("Answer =" + Integer.toBinaryString(ans));//Integer is converted into a string.
        }

        public static void main(String[] args) {
            m1();
        }
    }


