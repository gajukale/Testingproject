package ex_09_oops_constructor;

public class Lab_093_DC_Practice4 {
    public static void main(String[] args) {
        Car3 c1= new Car3();
        System.out.println(c1.name);
        System.out.println(c1.modelname);
        System.out.println(c1.year);
    }
}

class Car3{
    String name;
    int year;
    String modelname;


    //DC
    Car3()
    {
        name="BMW";
        year=1990;
        modelname="BMW009";

    }
}
