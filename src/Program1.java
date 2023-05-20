package Homework_week_2;

public class Program1 {
    /**
     * Declare two instance variables
     * Declare one instance method
     * Call both instance variables into instance method inside the print statement
     * Declare the main method
     * Call method into the main method and run the program
     */
    int A = 10;
    int B = 20;

    public void insMethod(int A, int B) {
        Program1 program1 = new Program1();
        System.out.println(program1.A);
        System.out.println(program1.B);
    }

    public static void main(String[] args) {
        Program1 program1 = new Program1();
        System.out.println(program1.A);
        System.out.println(program1.B);


    }
}
