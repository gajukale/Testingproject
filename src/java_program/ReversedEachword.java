package java_program;

import java.sql.SQLOutput;

public class ReversedEachword {
    public static void main(String[] args) {
//        input = "gajanan kale"
//
//                Output 1= nanjag elak
//            output 2 = elak nanjag

        String input = "gajanan kale ";
        String parts[]=input.split(" ");
        String firstword= parts[0];//gajanan
        String secondword=parts[1];//kale

        String reversedfirst=" ";
        for (int i=firstword.length()-1;i>=0;i--)
        {
            reversedfirst+=firstword.charAt(i);

        }
        String reversedsecond=" ";
        for (int i= secondword.length()-1;i>=0;i--)
        {
            reversedsecond += secondword.charAt(i);
        }

        System.out.println("Output 1 : "+ reversedfirst + " "+ reversedsecond );
        System.out.println("Output 2 : "+ reversedsecond + " " + reversedfirst );

    }
}
