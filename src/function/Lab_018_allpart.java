package function;

public class Lab_018_allpart {

    // User Defined functions:
    // 1. Without parameter and without return type
    // 2. Without parameter and with return type
    // 3. With parameter and without return type
    // 4. With parameter and with return type

    public static void main(String[] args) {
        // 1. Without parameter and without return type
        wp_wr_greet();

        // 2. Without parameter and with return type
        String message = wp_butwithreturngreet();
        System.out.println(message);

        // 3. With parameter and without return type
        wp_withoutreturn("Gajanan", 30, 20000.0);
        wp_withoutreturn("shiwani", 25, 10000.0);
        wp_withoutreturn("raju",24,30000.00);
        // 4. With parameter and with return type
        int sum= sum_of_parameters(3,4);
        System.out.println("sum of the a+b :"+ sum);
    }

    // 1. Without parameter and without return type
    static void wp_wr_greet() {
        System.out.println("Type 1: Without parameter and without return type");
        System.out.println("Hi, How are you");
    }

    // 2. Without parameter and with return type
    static String wp_butwithreturngreet() {
        System.out.println("Type 2: Without parameter and with return type");
        return "Hi, How are you";
    }

    // 3. With parameter and without return type
    static void wp_withoutreturn(String name, int age, Double salary) {
        System.out.println("Your name is: " + name + ", Your age: " + age + ", Your salary: " + salary);
    }
    // 4. With parameter and with return type
static int sum_of_parameters(int a,int b)
{
    return a+b;
}


}
