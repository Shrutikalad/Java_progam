import java.util.*;

public class Addition
{
    public static void main(String [] args)
    {
        int num1 = 0;
        int num2 = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("enter 1st number : ");
        num1 = s.nextInt();

        System.out.println("enter 2st number : ");
        num2 = s.nextInt();
        
        int sum = num1 + num2;
        System.out.println("add of "+ num1 +" and "+ num2+ "is "+ sum +".");
    }
}