package ex_09_oops_constructor;

import org.w3c.dom.ls.LSOutput;

public class Lab_096_Parattermize_Constructor1 {
    public static void main(String[] args) {
        Baby5 b5= new Baby5();
        b5.adhar_number="9hu034566";
        System.out.println(b5.adhar_number);

        //PC
        Baby5 b7=new Baby5("gajanan","88990GHI","789ECTInd", 1995);
        System.out.println(b7.adhar_number);
    }
}

class Baby5{

    String name;
    String adhar_number;
    String election_Number;
    int Year;

    //Dc

    Baby5()
    {
        name="bala";
        adhar_number="90456666";
        election_Number="7u89034";
        Year= 2008;

    }

    Baby5(String name_user,String adhar_number_user,String election_Number_user,int Year_user)
    {
        this.adhar_number=adhar_number_user;
        this.Year=Year_user;
        this.name=name_user;


    }
}
