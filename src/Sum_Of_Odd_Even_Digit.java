import java.util.Scanner;   // Import scanner for user input Value.

public class Sum_Of_Odd_Even_Digit  // Class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any five Digit Number :- "); // Print Statement for user in put
        int number = scanner.nextInt(); // store user input value by scanner object + local instance variable
        int odd = 0; int even = 0; int a = 0; int b = 0; int store = 0; // a= sum of odd, b = sum of even + local instance variable
        if (number>=10000 && number<100000) // apply condition by using Equivalence class partitioning, only 5 digit can accepted
        {
            while (number > 0) {    // apply condition by using while Loop + enter number must be positive
                store = number % 10;  // Find last digit by Modulus 10
                if (number % 2 == 0) {  // apply if condition to find number is odd or even
                    b = b + store;   // add the even number values + store the value in store
                    even++;     // increment even number value by running loop
                } else {
                    a = a + store;   // add the odd number values + store the value in store
                    odd++;      // increment odd number value by running loop
                }
                number = number / 10;   // remove last digit from number by dividing the number by 10
            }

            System.out.println("Number of odd are :- " + odd);      // String Concatenation statement for how many number of Odd digit you have enter
            System.out.println("Sum of Entered Odd number:- " + a); // String Concatenation statement for Sum of all Odd digit number you have enter
            System.out.println("Number of Even are :-" + even);     // String Concatenation statement for how many number of Even digit you have enter
            System.out.println("Sum of Entered Even number:-" + b); // String Concatenation statement for Sum of all Even digit number you have enter
        } else
            {
                System.out.println(" Enter Number dose not contain five Digit Number" );    // String Concatenation statement will print When enter digit grater or las then 5
            }
    }
}
