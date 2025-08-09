package ex_06_stringBUffervsstringBuilder;

public class Lab_030StringBuffer1
{
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Gajanan");
        stringBuffer.append("Kale");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
    }
}
