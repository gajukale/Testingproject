package ex_09_oops_constructor;

public class Lab_098_PC_practice {
    public static void main(String[] args) {
Players sport= new Players("Ram","990","777",7058945149L,"Kale");
        System.out.println(sport.id);
        System.out.println(sport.mobile_numbers);
        System.out.println(sport.name);
        System.out.println(sport.Tshirtnumber);
        System.out.println(sport.surname);
    }
}

class Players
{
    String name;
    String id;
    String Tshirtnumber;
    long mobile_numbers;
    String surname;




    Players(String name_users,String id_users,String Tshirtnumber_users,long mobile_numbers_user,String surname_users)
    {
        this.name=name_users;
        this.id=id_users;
        this.mobile_numbers=mobile_numbers_user;
        this.surname=surname_users;
        this.Tshirtnumber=Tshirtnumber_users;
    }


}
