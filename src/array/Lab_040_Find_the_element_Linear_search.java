package array;

public class Lab_040_Find_the_element_Linear_search
{
    public static void main(String[] args)
    {
        int []a={23,43,45,67,87,90};
        //Find the 67 target ,give the index
        int tagrget= 67;
        for (int i=0;i<a.length;i++)
        {
            if(tagrget==a[i])
            {
                System.out.println("Index of the 67 :  "+ i);
            }
        }

    }
}
