import java.util.Scanner;   // Import scanner for user input Value.

public class Factorial_Value    // Class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any  Number :- "); // Print Statement for user in put
        int val1 = scanner.nextInt();   // store user input value in local instance variables by scanner object
        int a=1;
        for (int i = 5; i>0; i--)   // apply for Loop Factorial Value
        {
            a=a*i;

        } System.out.println(" Enter number Factorial value is  " + a); // String Concatenation statement for Factorial Value
    }
}
