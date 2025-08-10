package ex_09_oops_constructor;

public class Lab_056_OOPs_constructor
{
    public static void main(String[] args) {
        Baby b1 = new Baby() ;
    }

}

class Baby
{
    //attribute | Instance varible |
    String name ;

    Baby ()
    {
        System.out.println("Hi , I am called Default constructor ");
        System.out.println("Yoour aadhar number is ready");
    }

    //Behaviour
    void cry ()
    {
        System.out.println("cry");
    }
    void sleep ()
    {
        System.out.println("sleep");
    }
    void eat()
    {
        System.out.println("Eat");
    }


}

