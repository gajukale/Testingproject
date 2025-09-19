package ex_09_oops_constructor;

public class Lab_095_DC_Practice {
    public static void main(String[] args) {
        BabyC bala1 = new BabyC();
        bala1.name = "Pillu";
        System.out.println(bala1.Adhar_number);
        System.out.println(bala1.name);
        System.out.println(bala1.years);

    }
}

class BabyC {
    String name;
    String Adhar_number;
    int years;

    //Dc

    BabyC() {
        name = "Bala";
        Adhar_number = "095677";
        years = 1990;

    }

}

