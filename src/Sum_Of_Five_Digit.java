import java.util.Scanner;   // Import scanner for user input Value.

public class Sum_Of_Five_Digit // Class
{


    public static void main(String [] args)     // Java Main method
    {
        Scanner scanner = new Scanner (System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any five Digit Number :- "); // Print Statement
        int a = scanner.nextInt();// store user input value by scanner object, local instance variable
        int b ; // local instance variable
        int c = 0; // local instance variable for return value
        if (a >= 10000 && a <= 100000) // apply condition by using Equivalence class partitioning, only 5 digit can accepted
        {
        while (a>=1) // apply condition by using while Loop
        {
            b = a%10; // Find last digit by Modulus 10
            c = b+c;    // add the value b (last digit + return value)
            a = a/10;   // remove last digit from number by dividing the number by 10
        }
        System.out.println("Sum Of Each Digit:- " + c);// String Concatenation

        }   else {
            System.out.println(" Enter Number dose not contain five Digit Number "); // String Concatenation statement will print When enter digit grater or las then 5
                }
    }
}
