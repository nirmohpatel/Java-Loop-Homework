import java.util.Scanner;   // Import scanner for user input Value.

public class Sum_of_First_And_Last_Digit    // class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any five Digit Number :- "); // Print Statement
        int value = scanner.nextInt(); int a = value/10000; int b = value%10;   //local instance variable b to store value for last digit
        // store user input value by scanner object in local instance variable + local instance variable a to store value for First digit
        if (value >= 10000 && value <= 100000)  // apply condition by using Equivalence class partitioning, only 5 digit can accepted
        {
            b = a + b;      // add the both value b (First digit + Last digit)

            System.out.println(" Sum of First and Last Digit :- " +  b); // String Concatenation statement for Sum of first and Last digit
        } else
        {
            System.out.println("Enter Number dose not contain five Digit Number");   // String Concatenation statement will print When enter digit grater or las then 5
        }
    }
}
