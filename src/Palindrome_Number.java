import java.util.Scanner;   // Import scanner for user input Value.

public class Palindrome_Number  // Class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any Number :- "); // Print Statement
        int digit = scanner.nextInt(); int reverse = 0; int store = 0; int number = digit;
        // store user input value by scanner object, local instance variable + Create local instance variable for reverse + store + number + store digit value in number
        {
            while (digit >0)    // apply condition by using while Loop
            {
                store = digit % 10; // Find last value by modulus 10
                reverse = (reverse * 10) + store;   // store digit value in revers variable
                digit = digit / 10;     // remove last digit from number by dividing the number by 10
            }
            if (reverse == number) // apply if condition for reverse value match with Enter value
            {
                System.out.println( "Enter Number "+ number + " is Palindrome Number ");  // String Concatenation statement for Palindrome Number
            } else
                {
                    System.out.println( "Enter Number "+ number + " is not Palindrome Number ");   // String Concatenation statement
                }
        }
    }
}
