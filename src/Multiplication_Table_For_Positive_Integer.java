import java.util.Scanner;   // Import scanner for user input Value.

public class Multiplication_Table_For_Positive_Integer  // Class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Positive Integer Value :- "); // Print Statement for user input
        int a = scanner.nextInt();  // store user input value in local instance variables by scanner object
        if (a > 0)  // apply if condition
        {
            for (int i = 1; 10 >= i; i++)   // apply for Loop Multiplication
            {
                System.out.println(a + " X " + i + " = " + a * i);// String Concatenation statement for Multiplication Table
            }
        } else
            {
                System.out.println(" Please Enter Positive Integer Value "); // String Concatenation statement for negative scenario
            }
    }
}
