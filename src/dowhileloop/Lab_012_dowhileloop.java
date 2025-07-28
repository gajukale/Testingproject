package dowhileloop;

import java.util.Scanner;

public class Lab_012_dowhileloop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);//take first character
        //Check if charaacter as a vowel
        if (ch =='a'||ch=='e'||ch =='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+ " is a vowel ");
        }
        else if ((ch>='a'&& ch<='z'))
        {
            System.out.println(ch + " is a constant ");
        }
else
        {
            System.out.println("Invalid  input data , please enter the valid alphabate character ");
        }
scanner.close();
    }
}
