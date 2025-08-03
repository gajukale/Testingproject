package stringBUffervsstringBuilder;

public class Lab_029StringBuilder_Vs_Buffer
{
    public static void main(String[] args)
    {
        String s0= "gajanan";
        String s1=new String ("gajanan");

        StringBuffer stringbuffer= new StringBuffer("gajanan");
        StringBuilder stringbuilder=new StringBuilder("gajanan");
        System.out.println("Normal string "+s0);
        System.out.println("with the new keyword "+ s1);
        System.out.println("With the stringbuffer "+ stringbuffer);
        System.out.println("With the stringbuilder "+ stringbuilder);

    }

}
