package Homework_week_2;

public class Program4 {
    /**
     * Declare two instance and two static variables
     * declare one static method
     * declare one instance method
     * call all variables into both static and instance method inside the print statement
     * declare the main method
     * call both methods into the main method and run the program
     */
    static int A = 10;
    static int B = 20;
    int C = 30;
    int D = 40;


    public static void var(int A, int B) {

        System.out.println(Program4.A);
        System.out.println(Program4.B);
    }

    public void insMethod(int C, int D) {
        Program4 program4 = new Program4();
        System.out.println(program4.C);
        System.out.println(program4.D);
    }

    public static void main(String[] args) {
        Program4 program4 = new Program4();
        var(program4.A, program4.B);
        program4.insMethod(program4.C, program4.D);
    }
}
