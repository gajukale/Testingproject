package array;

public class Lab_0038_2nd_Highest_without_sort
{
    public static void main(String[] args)
    {
        int [] arr= {5,7,2,9,7,4};
        int first =Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;

        for (int num : arr)
        {
            if (num>first)
            {
                second=first;
                first=num;
            }
            else if
            (num>second && num !=first)
            {
                second =num;
            }
        }
        if(second == Integer.MIN_VALUE)
        {
            System.out.println("No second highest found");
        }
        else {
            System.out.println("second highest number is "+ second);
        }

    }
}
