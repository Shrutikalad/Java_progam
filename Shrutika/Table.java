import java.util.*;

public class Table {
    public static void main(String[] args)
    {
        int num=0,i=0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        num = s.nextInt();
        i=1;
        while(i <= 10)
        {
            //System.out.println(num * i);
            System.out.println("" + num + " * "+ i +" = " + num * i + "");
            i++;
        }

    }
}
