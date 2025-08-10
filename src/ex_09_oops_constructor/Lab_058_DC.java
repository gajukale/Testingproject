package ex_09_oops_constructor;

public class Lab_058_DC
{
    public static void main(String[] args) {
        car c1= new car();
        c1.name ="Tesla";
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

    }
}
class car
{
    String name ;
    int year ;
    String model;

    car ()
    {
        name = "Unknown car ";
        year = 1991;
        model = "VC_345";

    }
}
