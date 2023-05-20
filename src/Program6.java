package Homework_week_2;
/**Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter r : ");
        int r = scanner.nextInt();
        double Area = 3.14*r*r;
        System.out.println("Area is A : " + Area);
    }
}
