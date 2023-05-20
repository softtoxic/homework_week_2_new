package Homework_week_2;

/**
 * Write a Java program to compute the specified expressions and print the
 * output
 */
public class Program12 {

    public static void main (String[] args){
        float A = 25.5f;
        float B = 3.5f;
        float C= 40.5f;
        float D = 4.5f;
        float calculation = ((A*B - B * B)/(C - D));
        System.out.println("calculation is : " + calculation);
    }
}
