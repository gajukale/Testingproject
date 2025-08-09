package ex_02dowhileloop;

import java.util.Scanner;

public class Lab_013_checkvowels
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the single character");
        char ch=scanner.next().toLowerCase().charAt(0);

        switch (ch)
        {
            case  'a','e','o','u'-> System.out.println("Vowel");
            default -> System.out.println("All are consonant");
        }
        scanner.close();


    }
}
