package ex_07_array;

import java.util.Scanner;

public class Lab_045_Right_tringle
{
    public static void main(String[] args)
    {
        //How the pattern we want
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number how many star you want");
        int n=sc.nextInt();
       // Excel sheet check - you want to add first row index i should not be more than column index
        //thats why j<=i we used the condition
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
