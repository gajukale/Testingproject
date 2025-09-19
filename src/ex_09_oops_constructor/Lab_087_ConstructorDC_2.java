package ex_09_oops_constructor;

import org.w3c.dom.ls.LSOutput;

public class Lab_087_ConstructorDC_2 {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat();
        Cat c2;

        c1.running();
    }

}

class Cat {
    String name;


    void running() {
        System.out.println("Running");
    }
}
