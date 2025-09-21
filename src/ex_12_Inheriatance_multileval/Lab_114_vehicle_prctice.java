package ex_12_Inheriatance_multileval;

public class Lab_114_vehicle_prctice {
    public static void main(String[] args) {
Bike b1 = new Bike();
//b1.vehicle();
b1.Bike();
b1.vehicle();


    }
}

class Vehicle{
    void vehicle ()
    {
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    void Bike ()
    {
        System.out.println("Bike is ready");
    }
}
