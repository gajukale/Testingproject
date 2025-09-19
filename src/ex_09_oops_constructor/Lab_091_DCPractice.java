package ex_09_oops_constructor;

public class Lab_091_DCPractice {
    public static void main(String[] args) {
        kale k1 = new kale();
        new kale();
        kale k2 = new kale();

        k2.namdev();
        k1.shankar();
        k1.gajanan();
    }
}

class kale {
    //Attribute/Instant varibile /Data varible

    String name;

    kale() {
        System.out.println("Kale is the family name ");
    }

    void namdev() {
        System.out.println("namdev is the grandfather ");
    }

    void shankar() {
        System.out.println("Shankar is the father ");
    }

    void gajanan() {
        System.out.println("i am a gajanan");
    }
}
