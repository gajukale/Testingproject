package string;

public class Lab_023_immutable
{
    public static void main(String[] args) {
        String s1="hello";
      //  s1.concat("word");
       // System.out.println(s1);//without world its will print hello
        s1=s1.concat(" world ");
        System.out.println(s1);
    }
}
