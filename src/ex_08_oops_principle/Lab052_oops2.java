package ex_08_oops_principle;

public class Lab052_oops2 {
    public static void main(String[] args) {

       //one main method and one public class only
        student s1 = new student ();
//        s1.name="Pramod";
//        System.out.println(s1.name);
        student s2; //object refrenace
        new student (); //object creation

    }
}
class student
{
    String name ;
// is called as the default constructor , same name as the class name
    student ()// constructor
    {
        System.out.println("DC");
    }
    void sleep ()
    {
        System.out.println("Hi");
    }

}

