package ex_OOPs_Abstraction;

public class Lab_074_Ab_Cars {

    public static void main(String[] args) {
        WagnoR car = new WagnoR();
        car.drive();;
        //Engine e1= new Engine() ; Hide the engine
    }
}

abstract class Engine
{
    abstract void startEngine();
    abstract void stopEngine();

    void checkEngine()
    {
        System.out.println("Everything is good ");
    }
}

class WagnoR extends Engine
{

    @Override
    void startEngine() {
        System.out.println("starting the car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car");
    }

    void drive() {
        checkEngine();
        startEngine();
        stopEngine();

}
}
