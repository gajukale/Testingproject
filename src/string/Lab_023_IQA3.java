package string;

public class Lab_023_IQA3
{
    public static void main(String[] args)
    {
        String s1="hello";
        String s2="hello";
        String s3=new String ("hello");
        String s4=new String ("hello");
        String s5= new String ("Hello");
//Comparision- String - This check the location referance

        System.out.println(s1==s3);//1 present in SCP and 1 is OA
        System.out.println(s1==s2);
        System.out.println(s2==s3);//Object Are always created in different area
        System.out.println(s1==s4);//They are present in SCP so true
        System.out.println(s3==s5);

        //Equal check for contain value
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s2));
        System.out.println(s3.equalsIgnoreCase(s5));
        //equal ignore case-> gajanan,GAJANAN, Gajnan,
        //Check for the ref
        //=Assignment the value





    }
}
