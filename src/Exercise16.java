/**
 * Created by user on 12/12/2019.
 */
public class Exercise16
{
    public static void main(String args[])
    {
        boolean x = isEven(2);
        System.out.println(x);
    }
    public static boolean isEven(int a)
    {
        if(a%2 == 1)
            return false;
        else
            return true;
    }
}
