import java.util.*;

public class Print_character {
    public static void main(String[] args)
    {
        int num=0;
        Scanner s= new Scanner(System.in);

        System.out.println("Enter the number:");
        num= s.nextInt();

        if(num < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("World");
        }
    }
}
