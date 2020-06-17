import java.util.Scanner;   // Import scanner for user input Value.

public class Prime_Number   // Class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any Number :- "); // Print Statement
        int num = scanner.nextInt(); int a = 2; // store user input value in local instance variables by scanner object + local instance variables
        while (a <= num /2) // apply condition by using while Loop
        {
            if (num %a==0) // apply if condition is true then number is not prime number
            {
                System.out.println("Enter Number "+ num + " is not Prime Number " );  // String Concatenation for positive scenario
                break; // break loop
            }
            a++;    // increment value
            if (a == (num /2 + 1))  // apply if condition is true then number is prime number
                {
                    System.out.println("Enter Number "+ num + " is  Prime Number " ); // String Concatenation for positive scenario
                }
        }
    }
}
