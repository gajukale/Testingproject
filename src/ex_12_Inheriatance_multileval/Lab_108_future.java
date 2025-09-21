package ex_12_Inheriatance_multileval;

public class Lab_108_future {
    public static void main(String[] args) {
        Lab_105_Namdeo kale= new Lab_105_Namdeo();
        kale.grandfather_home();
        kale.Gold_grandfather();


        System.out.println("---------------------");

        Lab_106_Shanakar Kale2=new Lab_106_Shanakar();
        Kale2.Father_farm();
        Kale2.Father_home();

        System.out.println("-----------------------");

        Lab_107_Gajanan Kale3 = new Lab_107_Gajanan();
        Kale3.Son_farm();
        Kale3.Son_home();

        System.out.println("--------------------");

        Lab_106_Shanakar Kale_pusad= new Lab_107_Gajanan();//Dynamic Dispatch
        Kale_pusad.Father_home();
        Kale_pusad.Father_farm();
        Kale_pusad.grandfather();
        Kale_pusad.Gold_grandfather();
        Kale3.Son_home();
        Kale3.Son_farm();
        Kale_pusad.Gold_grandfather();

    }
}
