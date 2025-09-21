package ex_12_Inheriatance_multileval;

public class Lab_111_Nilesh {
    public static void main(String[] args) {
        Lab_108_KaleKashinath kale_pabhal= new Lab_108_KaleKashinath();
        kale_pabhal.kashinath_gold();
        kale_pabhal.kashinath_kale_farm();
        kale_pabhal.kashinath_gold();

        System.out.println("__________________________");

        Lab_109_Kale_Rameshawar kale_pabhal2= new Lab_109_Kale_Rameshawar();
        kale_pabhal2.rameshawar_home();
        kale_pabhal2.rameshwar_farm();
        kale_pabhal2.rameshwar_gold();

        System.out.println("______________________________");

        Lab_110_Kale_sanjay kale_pabhal3= new Lab_110_Kale_sanjay();
        kale_pabhal3.sanjay_farm();
        kale_pabhal3.sanjay_gold();
        kale_pabhal3.sanjay_home();
        System.out.println("_______________________________");

        Lab_108_KaleKashinath kale_direct_son = new Lab_110_Kale_sanjay();
        kale_direct_son.kashinath_gold();
        kale_direct_son.kashinath_home();
        kale_direct_son.kashinath_kale_farm();

        System.out.println("_______________________");

        Lab_109_Kale_Rameshawar kale_niece= new Lab_110_Kale_sanjay();
        kale_niece.rameshwar_gold();
        kale_niece.rameshwar_farm();
        kale_niece.rameshawar_home();

    }
}
