package ex_09_oops_constructor;

import java.sql.SQLOutput;

public class Lab_090DC_Practice {
    public static void main(String[] args) {
        Bike1 moped=new Bike1();
        //new Bike1();// new object will create
        moped.Break();
        moped.gear();

    }
}

class Bike1 {

    //Attribute|data member|Instant varible

    String name ;

    //Default constructor

    Bike1() {
        System.out.println("Honda ");
        System.out.println("Splendar");
    }
    void gear()
    {
        System.out.println("Gear of the bike");
    }
    void Break()
    {
        System.out.println("Moped of the break");
    }
}