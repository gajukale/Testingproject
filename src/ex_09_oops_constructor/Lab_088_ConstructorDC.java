package ex_09_oops_constructor;

public class Lab_088_ConstructorDC
{
    public static void main(String[] args)
    {
        Cat1 c3=new Cat1();
        new Cat1();
        c3.running();


    }
}

class Cat1
{
    String name;

    void running ()
    {
        System.out.println("Running2");
    }

}

