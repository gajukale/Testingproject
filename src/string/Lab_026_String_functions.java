package string;

public class Lab_026_String_functions
{
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        String str3=new String ("Hello");
        System.out.println(str1==str2);//True
        System.out.println(str1==str3);//False - memory are different
        System.out.println(str1.equals(str3));//True



    }
}
