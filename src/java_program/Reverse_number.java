package java_program;

public class Reverse_number
{
    public static void main(String[] args)
    {
        int num=12345;
        int reverse=0;
        while (num!=0)
        {
            int digit=num%10;//get the last digit
            reverse=reverse*10+digit;//get the reverse number
            num=num/10;//remove the last digit
        }
        System.out.println("reverse number "+ reverse );

    }
}
