package array;

import java.util.Arrays;

public class Lab_037_second_highest_numbers
{
    public static void main(String[] args) {
        int numbers[]= {12,13,10,1,100,3,4,32};
        //100,34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}
