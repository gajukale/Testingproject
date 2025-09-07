package ex_Prepost;

import java.net.StandardSocketOptions;

public class Lab_075_prepost
{
    public static void main(String[] args) {
        int i=5;
        int j = i++ + ++i;

        System.out.println("i :" + i +", j:" + j);
    }
}
