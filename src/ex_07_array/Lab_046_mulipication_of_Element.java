package ex_07_array;

import java.util.Scanner;

public class Lab_046_mulipication_of_Element
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the table");
        int size_of_table= sc.nextInt();

        for (int i=0;i<size_of_table;i++)
        {
            for(int j=0;j<size_of_table;j++)
            {
                System.out.print( i*j + " | ");
            }
            System.out.println();
        }

    }
}
