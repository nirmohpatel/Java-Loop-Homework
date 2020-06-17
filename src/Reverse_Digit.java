import java.util.Scanner;   // Import scanner for user input Value.

public class Reverse_Digit  // class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any five Digit Number :- "); // Print Statement
        int digit = scanner.nextInt(); int reverse = 0; // store user input value by scanner object, local instance variable + Create local instance variable for reverse
        if (digit>=10000 && digit<100000)   // apply condition by using Equivalence class partitioning, only 5 digit can accepted
        {
            while (digit != 0)    // apply condition by using while Loop
            {
                reverse = reverse * 10;     // store digit value in revers variable
                reverse = reverse + digit % 10; // Find last value by modulus 10
                digit = digit / 10;     // remove last digit from number by dividing the number by 10
            }
            System.out.println("Out put of Enter Digit :- " + reverse); // String Concatenation statement for Reverse digit
        } else
            {
                System.out.println(" Enter Number dose not contain five Digit Number " );  // String Concatenation statement will print When enter digit grater or las then 5
            }
    }
}
