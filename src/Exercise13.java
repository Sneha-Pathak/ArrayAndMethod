/**
 * Created by user on 12/12/2019.
 */
public class Exercise13
{
    public static void main(String args[])
    {
        int ar[] = {34,12,25,3,-1,-78,0,9,47,59,4,8,36,5,0,2,15,76,98,10};
        int zero = 0, neg = 0, pos = 0, odd = 0, even = 0;

        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i] == 0)
            {
                zero = zero + 1;
            }
            else if(ar[i] < 0)
            {
                neg = neg + 1;
            }
            else
            {
                pos = pos + 1;
            }
        }
        System.out.println("Number of 0's : " + zero);
        System.out.println("Number of Negative no : " + neg);
        System.out.println("Number of Positive no : " + pos);

        for (int i = 0; i < ar.length; i++)
        {
            if(ar[i]%2 == 1)
            {
                odd = odd + 1;
            }
            else
            {
                even = even + 1;
            }
        }
        System.out.println("Even no : " + even);
        System.out.println("Odd no : " + odd);
    }
}
