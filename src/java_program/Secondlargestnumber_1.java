package java_program;

public class Secondlargestnumber_1
{
    public static void main(String[] args)
    {
        int numbers[]={30,40,50,60,70};
        int largest=numbers[0];
        int secondlarsgest=Integer.MIN_VALUE;

        for (int i=1;i< numbers.length;i++)
        {
            if(numbers[i]>largest)
            {
                secondlarsgest=largest;
                largest=numbers[i];

            }
            else if (numbers[i]>secondlarsgest&&numbers[i]!=largest)
            {
                secondlarsgest=numbers[i];

            }
        }
        System.out.println("second largest : " +secondlarsgest );

    }
}
