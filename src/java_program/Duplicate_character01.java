package java_program;

public class Duplicate_character01
{
    public static void main(String[] args)
    {
        String str= "programming";

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if (str.indexOf(c)!=str.lastIndexOf(c))
            {
                if (str.indexOf(c)==i)
                    System.out.println("duplicate character : "+c);
            }
        }

    }
}
