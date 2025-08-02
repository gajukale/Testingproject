package function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_020Function_interview2
{
    public static void main(String[] args) {
        // Create a function of the sum, sub,Mul and Div
        //With parameter,a,b (take a parameter from the user)
        //Logic Building
        //Step 1-> Input and Outputs
        //a,b -> Int -> Scanner
        //Int -> Varible result
        //Step 2- Rough logic- create functions
        //functions -> type 4th with return and with argument
        //Step 3 - Write the code and find the fix -> Eges cases

        Scanner scanner= new Scanner (System.in);
        System.out.println(" Enter the num 1");
        int a = 0;
        if(scanner.hasNextInt())
        {
            a= Integer.parseInt(scanner.next());
        }
        else {
            System.out.println("Enter the int only ");
           // return ;
            System.exit(0);


        }

        System.out.println(" Enter the num 2");
        int b = scanner.nextInt();
        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        System.out.println("sum of the a and b : " + result_sum);
        System.out.println("Subtraction of the a & b : "+ result_sub);
        System.out.println("Multipication of the a & b : "+result_mul );
        System.out.println("Division of the a & b : "+result_div );




    }
    /** add the two intergers
     *
     * @param a-the first integer
     * @param b- the second integer
     * @return - the sum of the a and b
     */
    static int sum (int a,int b)
    {
        return a+b;

    }
    /** Subtraction the two intergers
     *
     * @param a-the first integer
     * @param b- the second integer
     * @return - the subtraction of the a and b
     */


    static int sub(int a,int b)
    {
        return a-b;

    }
    /** Multiplcation the two intergers
     *
     * @param a-the first integer
     * @param b- the second integer
     * @return - the mul of the a and b
     */

    static int mul(int a,int b)
    {
        return a*b;

    }
    /** Division the two intergers
     *
     * @param a-the first integer
     * @param b- the second integer
     * @return - the  quotient of the a and b
     */
    static int div(int a,int b)
    {
        if (b==0)
        {
            //System.out.println(" b can not be zero ");
            //System.exit(0);
            throw new ArithmeticException("B can not be zero");
        }
        return a/b;

    }



}
