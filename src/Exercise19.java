/**
 * Created by user on 12/13/2019.
 */
public class Exercise19
{
    public static void main(String args[])
    {
        getAverage();
    }

    public static void getAverage()
    {
        int a[]={5,7,15,10,8};
        double avg = 0;

        for (int i = 0; i < a.length; i++)
        {
            avg = avg + a[i]/a.length;
        }
        //System.out.println(sum);
        System.out.println("Average of Array : " + avg);
    }
}
