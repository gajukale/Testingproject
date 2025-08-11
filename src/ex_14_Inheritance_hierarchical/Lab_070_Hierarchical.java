package ex_14_Inheritance_hierarchical;

import ex_12_Inheriatance_multileval.Father;

public class Lab_070_Hierarchical {
    public static void main(String[] args) {
father f1 = new father();
ruhani r1= new ruhani();

r1.home();
f1.home();
Pramod p1= new Pramod();
p1.home();
lucky l1= new lucky();
l1.home();
l1.home();
    }
}
class father
{
    void home ()
    {
        System.out.println("3BHK");
    }

}
class Pramod extends father
{
    void h2 ()
    {
        System.out.println("h2-Pramod");
    }
}
class lucky extends father
{
    void home()
    {
        System.out.println("Lucky");
    }
}
class ruhani extends father{
    void home()
    {
        System.out.println("ruhani");
    }
}

