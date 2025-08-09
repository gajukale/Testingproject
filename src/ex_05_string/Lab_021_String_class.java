package ex_05_string;

public class Lab_021_String_class
{
    public static void main(String[] args)
    {
        String name = "Gajanan";//String constant pole
       // name.toUpperCase();
        //System.out.println(name);
        // Value alwyas older , means string immutable. if reasign the value then value change

        name = name.toUpperCase();
        System.out.println("aftetr the reassign then uppercase will come : "+ name);


    }
}
