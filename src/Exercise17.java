/**
 * Created by user on 12/12/2019.
 */

import java.util.Scanner;

public class Exercise17
{
    public static void main(String args[])
    {
        System.out.println(" MENU ");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Modulus");
        System.out.println();
        System.out.print("Enter your choice : ");

        Scanner input =  new Scanner(System.in);
        int ch = input.nextInt();

       // System.out.println();
        System.out.print("Enter your two number : ");
        int no1 = input.nextInt();
        int no2 = input.nextInt();

        if (ch == 1)
        {
            add(no1,no2);
        }
        if (ch == 2)
        {
            subtract(no1,no2);
        }
        if(ch == 3)
        {
            multiply(no1,no2);
        }
        if (ch == 4)
        {
            divide(no1,no2);
        }
        if (ch == 5)
        {
            modulus(no1,no2);
        }
        //System.out.println("Continue ? (Y/N) ");
        //Boolean con = input.nextBoolean();

    }

    public static void add(int a, int b)
    {

        int c = a + b;
        System.out.print("Result : " + c);
    }

    public static void subtract(int a, int b)
    {
        int c = a - b;
        System.out.print("Result : " + c);
    }

    public static void multiply(int a, int b)
    {
        int c = a * b;
        System.out.println("Result : " + c);
    }

    public static void divide(int a, int b)
    {
        int c = a / b;
        System.out.println("Result : " + c);
    }

    public static void modulus(int a, int b)
    {
        int c = a % b;
        System.out.println("Result : " + c);
    }
}
