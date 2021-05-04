/**
 * Created by user on 12/13/2019.
 */
import java.util.Scanner;

public class Exercise18
{
    public static void main(String args[])
    {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter no1 : ");
        int no1 = input.nextInt();
        System.out.print("Enter no2 : ");
        int no2 = input.nextInt();
        System.out.print("Enter no3 : ");
        int no3 = input.nextInt();

        int l = large(no1,no2,no3);
        int s = small(no1,no2,no3);

        System.out.println("Large no : " + l);
        System.out.println("Small no : " + s);
    }
    public static int small(int a, int b, int c)
    {
        if (a < b && a < c)
        {
            return a;
        }
        else  if (b < a && b < c)
        {
            return b;
        }
        else
            return c;
    }
    public static int large (int a, int b, int c)
    {
        if(a > b && a > c)
        {
            return a;
        }
        else if (b > a && b > c)
        {
            return b;
        }
        else
            return c;
    }
}
