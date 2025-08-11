package ex_10_OOPs_Inheriatance;

import java.sql.SQLOutput;

public class Lab_061_Inheritance
{
    public static void main(String[] args) {

        Father f1= new Father();
        System.out.println(f1.gold_f);
        f1.bike2();


        son s1= new son();
        System.out.println(s1.gold_f);
        s1.bike2();


    }
}
class Father{
    int gold_f=1000;    // Attribute | Data varibles | Property
    void bike2 ()// Behaviour|Method|Function| Data Memebers
    {
        System.out.println("Father - 2BHK");
    }

}
class son extends Father
{
//    int gold_f=1000;    // Attribute | Data varibles | Property
//    void bike2 ()// Behaviour|Method|Function| Data Memebers
//    {
//        System.out.println("Father - 2BHK");
//    }
void bhk3()
{
    System.out.println("3BHK son");
}


}

