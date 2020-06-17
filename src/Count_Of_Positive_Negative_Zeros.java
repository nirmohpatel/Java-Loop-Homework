import java.util.Scanner;

public class Count_Of_Positive_Negative_Zeros
{
    public static void main(String[] args)     // Java Main method
    {
        Scanner scanner = new Scanner(System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any two Digit Number :- "); // Print Statement
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        if (a <0 )
        {
            for (int i = a; i <= b; i++)
            {
                if (i > 0) {
                    x++;
                } else if (i == 0) {
                    y++;
                } else {
                    z++;
                }
            }
            System.out.println("Number of negative value1:- " + x);
            System.out.println("Number of Zero value2:- " + y);
            System.out.println("Number of Positive value3:- " + z);
        } else if((a>0 && b>0) && (a<0 && b<0))
            {
                if (a>0 && b>0)
                {
                for (int i = a; i > b; i++)
                {
                    if (i > 0)
                    {
                        x++;
                    } else if (i == 0)
                    {
                        y++;
                    } else
                        {
                        z++;
                        }
                }
                System.out.println("Number of negative value4:- " + x);
                System.out.println("Number of Zero value5:- " + y);
                System.out.println("Number of Positive value6:- " + z);
                }   else if(a<0 && b<0)
                {
                    for (int i = a; i == b; i++)
                    {
                        if (i > 0)
                        {
                            x++;
                        } else if (i == 0)
                        {
                            y++;
                        } else
                            {
                            z++;
                        }
                    }
                    System.out.println("Number of negative value1:- " + x);
                    System.out.println("Number of Zero value2:- " + y);
                    System.out.println("Number of Positive value3:- " + z);
                }

            } /*else if ((a==0 && b==0) || (a==0 && b<0))
            {
                if (a==0 && b==0)
                {
                    for (int i = a; i == b; i++) {
                        if (i < 0) {
                            x++;
                        } else if (i == 0) {
                            y++;
                        } else {
                            z++;
                        }
                    }
                    System.out.println("Number of negative value7:- " + x);
                    System.out.println("Number of Zero value8:- " + y);
                    System.out.println("Number of Positive value9:- " + z);
                }   else if (a==0 && b<0)
                    {
                        for (int i = a; i >= b; i--) {
                            if (i > 0) {
                                x++;
                            } else if (i == 0) {
                                y++;
                            } else {
                                z++;
                            }
                        }
                        System.out.println("Number of negative value7:- " + x);
                        System.out.println("Number of Zero value8:- " + y);
                        System.out.println("Number of Positive value9:- " + z);
                    } */else
                        {
                            System.out.println("Number of negative value10:- " + x);
                        }

            } /*else
                {
                    for (int i = a; i >= b; i--)
                    {
                        if (i > 0) {
                            x++;
                        } else if (i == 0) {
                            y++;
                        } else {
                            z++;
                        }
                    }
                    System.out.println("Number of negative value:- " + x);
                    System.out.println("Number of Zero value:- " + y);
                    System.out.println("Number of Positive value:- " + z);
                }*/
    }

