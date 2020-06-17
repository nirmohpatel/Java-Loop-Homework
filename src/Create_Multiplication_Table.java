import java.util.Scanner;

public class Create_Multiplication_Table
{
    public static void main(String[] args)     // Java Main method
    {

        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter First Value :- "); // Print Statement
        int value1 = scanner.nextInt();
        System.out.println("Please Enter Second Value :- "); // Print Statement
        int value2 = scanner.nextInt();

        /*for (int num1 =1; num1 <=value2;num1++)
        {
            int a = value1*num1;
            for (int num2 =1; num2 <=value1;num2++)
            {
                int matrix = a*num2;
                System.out.println(matrix + " ");
            }   System.out.println("");
        }*/
        //if (value1 >= 0 || value2 <= 10)
        {
            while (value1 >= 0 || value2 <= 10);
            for (int num1 =1; num1 <=10;num1++)
            {
                System.out.println(num1);

                for (int num2 =value1; num2 <=value2;num2++)
                {
                    System.out.println(num1*num2);
                }
                System.out.println("");
            }
        } //else {}
    }
}
