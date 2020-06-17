import java.util.Scanner;   // Import scanner for user input Value.

public class Armstrong_Number   // class
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any Number :- "); // Print Statement
        int num = scanner.nextInt();    //local instance variable num + store user in put value
        int b; int total = 0; int store = 0;b= num;int num_length; int powerSum = 1; // local instance variable
        num_length = (num + "").length();   // change length in to string
        while (num > 0) // apply condition by using while Loop
        {
            store = num%10; // Find last digit by Modulus 10
            for (int i = 0; i < num_length; i++)    // apply condition by using while Loop
            {
                powerSum = powerSum * store;    // calculate power of each digit
            }
            total=total+(powerSum); // Add all of them
            num = num/10;   // remove last digit from number by dividing the number by 10

        } if (b == total)   // apply if condition for statement String Concatenation
        {
            System.out.println(" Enter Number " + b + " is not Armstrong Number "); //String Concatenation
        } else
            {
                System.out.println("Enter Number " + b +" is  Armstrong Number");   //String Concatenation
            }
    }
}
