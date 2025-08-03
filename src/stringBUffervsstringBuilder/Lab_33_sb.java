package stringBUffervsstringBuilder;

public class Lab_33_sb
{
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Gajanan");
        sb.append("Kale");
        System.out.println(sb);
        sb.delete(5,16);//Delete the substring
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);

    }
}
