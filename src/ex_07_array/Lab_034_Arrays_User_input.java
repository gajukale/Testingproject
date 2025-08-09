package ex_07_array;

import java.util.Scanner;

public class Lab_034_Arrays_User_input
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays (int)only");
        int size=sc.nextInt();
        int [] number_marks = new int [size];
        for (int i=0;i<number_marks.length;i++)
        {
            System.out.println("Enter the marks");
            number_marks[i]=sc.nextInt();

        }
        System.out.println("----------------below code is printing ");

        for (int i=0;i<number_marks.length;i++)
        {
            System.out.println(number_marks[i]);
        }
    }
}
