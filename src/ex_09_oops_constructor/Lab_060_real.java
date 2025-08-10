package ex_09_oops_constructor;

public class Lab_060_real
{
    public static void main(String[] args) {
        Person p1=new Person("amit",8767643922L,"XYZ");
        Person p2=new Person("amit",8767643922L,"XYZ");


    }
}
class Person
{
    String name ;
    long phone;
    String address;




    Person(String name_user,long phone_user,String address_user)
    {
        this.name= name_user;
        this.address=address_user;
        this.phone=phone_user;
    }
    //Constructor overloading

    Person(String name_user)
    {
        this.name= name_user;
    }
    //Constructor overloading
    Person(String name_user,long phone_user)
    {
        this.name= name_user;
        this.phone=phone_user;
    }
}


