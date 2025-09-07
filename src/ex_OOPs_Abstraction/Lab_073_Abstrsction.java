package ex_OOPs_Abstraction;

public class Lab_073_Abstrsction {
    public static void main(String[] args) {
        Car c1 = new Car();
        // Father f1 = new Father(); // ❌ Cannot instantiate abstract class
        Child child = new Child();   // ✅ Works fine
        child.loan50K();
        child.loan25K();
        Father f2= new Child();

    }
}

class Car {
    // Concrete class (all methods implemented)
    void done() {
        System.out.println("Car is ready");
    }
}

abstract class Father {
    abstract void loan50K();

    void loan25K() {
        System.out.println("Given the 25K");
    }
}

// ✅ Now Child is outside Father
class Child extends Father {
    //Child has to complete the parent abstract class method this is the disadvantages of the abstract
    @Override
    void loan50K() {
        System.out.println("Son has to give the 50k Loan");
    }
}
