package Homework_week_2;

import java.util.Scanner;

/** Write a Java program that takes a number as input and prints its
 multiplication table up to 10
 */
public class Program10 {
    public void table() {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int n = 1;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n)); n++;
        System.out.println(A+" * " + n +" = " +(A*n));

   }

    public static void main(String[] args){
        Program10 program10 = new Program10();
                program10.table();
    }
}
