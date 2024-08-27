import java.util.*;
public class Multi {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        System.out.print("\n enter 1st number: ");
         num1 = s.nextInt();

        System.out.print("\n enter 2nd number: ");
        num2 = s.nextInt();
        
        int multi = num1 * num2;
        System.out.print("The multiplication of "+ num1 + " and " + num2 + " is " + multi +".");

        
    }
}