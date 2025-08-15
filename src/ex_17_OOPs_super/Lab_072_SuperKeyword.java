package ex_17_OOPs_super;

public class Lab_072_SuperKeyword {
}
class Vehicle
{
    public int maxSpeed=180;

    Vehicle()
    {
        System.out.println("Default counstructor");
    }
    Vehicle (int a)
    {
        System.out.println("Paratmised constructor");
    }
    //Method Overloading - same,same name functions with different arguments
    void message (int a)
    {
        System.out.println("Type2");
    }
    void message ()
    {
        System.out.println("Type 1");
    }
    int message (String a)
    {
        System.out.println("Type 3");
        return 0;
    }
    void display()
    {
        System.out.println("Vehicle Parent ");;
    }

}
class Car extends Vehicle
{
    private int maxSpeed= 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    Car ()
    {
super();
    }
    Car (int a)
    {
super(10);
    }
    void display ()
    {
        System.out.println("Hi, Override !");
    }
}