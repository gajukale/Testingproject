package ex_09_oops_constructor;

public class Lab_094_DC_Practice {
    public static void main(String[] args) {
        MobileNEW nothing= new MobileNEW();
        nothing.owner="shiwani";
        System.out.println(nothing.modelnnumber);
        System.out.println(nothing.name);
        System.out.println(nothing.modelnnumber);
        System.out.println(nothing.year);
        System.out.println(nothing.owner);
    }
}
class MobileNEW{
    String name;
    int year;
    String modelnnumber;
    String owner;




    MobileNEW()
    {
        name="Nothing2A";
        modelnnumber="N23";
        year=2000;
        owner="Gajanan";

    }
}
