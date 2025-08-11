package ex_11_oops_single_inheritance;

public class Lab_062_real_example {
    public static void main(String[] args) {
        Lab_064_Test_case t1 = new Lab_064_Test_case();
        t1.runningTC1();
        TestCase2 t2= new TestCase2();
        t2.runningTC2();


        Lab_063_common_all c2= new Lab_064_Test_case(); //Dynamic dispatch (extends )

    }

}
