package ex_09_oops_constructor;

public class Lab_060_PC_Constructor_overloading {
    public static void main(String[] args) {

        person1 p1 = new person1("amit", 8767643922L, "abc");
        person1 p2 = new person1("gajanan", 7058945149L, "pusad");
        person1 p3 = new person1();
        p3.name = "shiwani";
        System.out.println(p3.name);

        person1 p4 = new person1("luky", 8967895467L);
        System.out.println(p4.address);
        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }


}

class person1 {
    String name;
    long phone;
    String address;

    person1() {

    }

    person1(String name_user, long phone_user, String address_arg) {
        this.name = name_user;
        this.address = address_arg;
        this.phone = phone_user;
    }

    person1(String name_user, long phone_user) {
        this.name = name_user;
        this.phone = phone_user;
    }

    person1(String name_user) {
        this.name = name_user;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }


}
