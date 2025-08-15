package ex_17_OOPs_super;

public class Lab_073_SuperKeyword
{

}
class Vehicle {...}

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

    }
    Car (int a)
    {

    }
    void display ()
    {
        System.out.println("Hi, Override !");
    }
}