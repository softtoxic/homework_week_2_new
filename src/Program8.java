package Homework_week_2;
/**Write a program to calculate the area of a triangle.
*/
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of triangle B : ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of triangle H : ");
        double height = scanner.nextDouble();

        double Area = 0.5 *  base * height;
        System.out.println("The area of triangle is A : " + Area);


    }
}
