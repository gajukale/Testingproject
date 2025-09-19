package ex_09_oops_constructor;

import java.sql.SQLOutput;

public class Lab_086_constructor_DC {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2;
        new Student();

    }

}

class Student {
    String name;
    Student ()
    {
        System.out.println("DC");
    }

    void sleep()
    {
        System.out.println("Hi");
    }


}
