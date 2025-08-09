package ex_03_function;

public class Lab_016_simplemethod
{
    static void gajanan1()
    {
        System.out.println("This is the defincation of the method");

    }
    static int return_int()
    {
        System.out.println("this is the normal function which return something");
        return 10;
    }
      static boolean return_boolean()
      {
          System.out.println("this is the norml function which can return the boolean");
          return true;
      }

    public static void main(String[] args)
    {
        gajanan1();
        return_int();
        return_boolean();

    }


}
