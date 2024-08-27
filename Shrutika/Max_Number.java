import java.util.*;

public class Max_Number
{
    public static void main(String[] args)
    {
        int Num1 = 0;
        int Num2 = 0;
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        Num1 = s.nextInt();

        System.out.println("Enter the 2nd number:");
        Num2 = s.nextInt();

        if(Num1 > Num2)
        {
            System.out.println("Num1 is grater than Num2");
        }
        else if(Num1 == Num2)
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Num2 is grater than Num1");

        }
    }
}