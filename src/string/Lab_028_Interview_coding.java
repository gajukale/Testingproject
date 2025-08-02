package string;

import java.util.Scanner;

public class Lab_028_Interview_coding
{
    public static void main(String[] args) {
        //Palindorme
        //madam -> reverse-> madam
        //s1=madam
        //s1_reverse=madam
        //s1==s1_reverse

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string ");
        String original =scanner.nextLine();
        String reversed="";
        for (int i=original.length()-1;i>=0;i--)
        {
            reversed+=original.charAt(i);

        }
        if(original.equals(reversed))
        {
            System.out.println("It is a palindorme");

        }
        else {
            System.out.println("It is not a Palindorme");
        }
        scanner.close();

    }
}
