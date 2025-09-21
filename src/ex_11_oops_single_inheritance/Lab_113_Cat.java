package ex_11_oops_single_inheritance;

public class Lab_113_Cat  {

    public static void main(String[] args) {
        Cat sound = new Cat();
        sound.makeSound();
        sound.meow();
    }
}

class Cat extends Lab_112_Animal{
    void meow()
    {
        System.out.println("cat is making the sound");
    }
}


