import java.util.*;
public class Max_Three_Number
{
    public static void main(String[] args)
    {
        int Num1, Num2, Num3;
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        Num1 = s.nextInt();

        System.out.println("Enter the 2nd number:");
        Num2 = s.nextInt();

        System.out.println("Enter the 3rd number:");
        Num3 = s.nextInt();

        if(Num1 > Num2 && Num1 > Num3)
        {
            System.out.println("First number is greater.");
        }
        
        else if(Num2 > Num1 && Num2 > Num3)
        {
            System.out.println("Second number is greater.");
        }
        else 
        {
            System.out.println("Third number is greater.");
        }
    }
}