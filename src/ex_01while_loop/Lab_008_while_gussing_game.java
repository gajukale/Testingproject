package ex_01while_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_008_while_gussing_game
{
    public static void main(String[] args)
    {
        //guess number between 1 to 100
        //Random=> 1 to 100
        //java has prebuild class Random
        Random random= new Random();
        int numberToGuess= random.nextInt(100)+1;

        //System.out.println(numberToGuess);
        Scanner scanner= new Scanner((System.in));
        System.out.println("enter the number");
        int guess;
        int attemptes=0;
        while(true)
        {
            System.out.println("Enter the another guess");
            guess= scanner.nextInt();
            attemptes++;
            if(guess<numberToGuess)
            {
                System.out.println("too low try again");
            }
            else if(guess>numberToGuess)
            {
                System.out.println("too high try again");
            }
            else
            {
                System.out.println("Correct you guessed "+ attemptes + " congralutions");

            }
        }




    }
}
