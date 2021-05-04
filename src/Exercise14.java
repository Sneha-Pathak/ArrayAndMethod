/**
 * Created by user on 12/12/2019.
 */
public class Exercise14
{
    public static void main(String args[])
    {
        int[] arr = {10,55,5,12,25};
        int large = arr[0], small = arr[0];

        for (int i =0; i < arr.length; i++)
        {
            if (small >= arr[i])
            {
                small = arr[i];
            }
            if (large <= arr[i])
            {
                large = arr[i];
            }
        }
        System.out.println("Smallest no is : " + small);
        System.out.println("Largest no is : " + large);
    }
}
