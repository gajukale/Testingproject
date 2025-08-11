package ex_12_Inheriatance_multileval;

public class Runnerclass
{
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println("-----");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        Son s1= new Son();
        s1.s();
        s1.home();
        s1.gf();

    }
}
