package ex_09_oops_constructor;

public class Lab_092_DC_Practice {
    public static void main(String[] args) {
        Mobile m1= new Mobile();
        m1.Ram();
        m1.Rom();
    }
}
class Mobile{
    //Attribute /instantce varible

    String name ;

    //Default constructor
    Mobile()
    {
        System.out.println("Nothing mobile ");

    }
    //Beahvaiour
    void Ram()
    {
        System.out.println("Nothing mobile is good");
    }
    void Rom()
    {
        System.out.println("Nothing mobile good mobile ROM");
    }


}
