package ex_09_oops_constructor;

public class Lab_097_PC_RealExample {
    public static void main(String[] args) {
        Person3 p8= new Person3("Gajanan","HUIO990","IND0098DGH",2000);
        System.out.println(p8.adhar_Number);
        System.out.println(p8.name);
        System.out.println(p8.Election_Number);
        System.out.println(p8.Years);

    }
}

class Person3 {

    String name;
    String adhar_Number;
    int Years;
    String Election_Number;



    Person3(String name_user,String adhar_number_user,String Election_number_user,int Years_user)
    {
        this.name=name_user;
        this.adhar_Number=adhar_number_user;
        this.Election_Number=Election_number_user;
        this.Years=Years_user;


    }

}

