import java.util.*;

public class Reverse_table {
    public static void main(String[] args)
    {
        int num=0,i=0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        num = s.nextInt();
        i=10;
        while(i >= 1)
        {
            //System.out.println(num * i);
            System.out.println("" + num + " * "+ i +" = " + num * i + "");
            i--;
        }

    }
}
