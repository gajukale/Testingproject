package ex_16_OOPs_Access_specifier.criminal;

import ex_16_OOPs_Access_specifier.police.Cop;

public class Thif {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun=100;
       // thief.canIShoot(); //It cant access becouse in the COP class void method is protected it will work only in the same package

    }
}
