package ex_09_oops_constructor;

public class Lab_089_constructor_practice {
    public static void main(String[] args) {
        Baby1 gaju = new Baby1();
        gaju.cry();
        gaju.sleep();
    }
}

class Baby1 {
    //Attribute /Instant variable | memeber varible , Data varible

    String name;

    //Default constructor

    Baby1() {
        System.out.println("I am a default constructor");
        System.out.println("Your aadhar number is ready");

    }

    void cry() {
        System.out.println("Cry");
    }

    void sleep() {
        System.out.println("sleep");
    }

}