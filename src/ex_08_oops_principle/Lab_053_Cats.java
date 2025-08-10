package ex_08_oops_principle;

public class Lab_053_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat();          // Creates a Cat object (unused)
        Cat c2;             // Declares c2 (not initialized)
        c1.running();       // Calls running on c1

        new Cat().running(); // Creates a Cat and calls running immediately
    }
}

class Cat {
    String name;

    void running() {
        System.out.println("Running");
    }
}
