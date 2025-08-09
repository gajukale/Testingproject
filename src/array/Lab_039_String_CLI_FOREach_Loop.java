package array;

public class Lab_039_String_CLI_FOREach_Loop {
    public static void main(String[] gajanan)
    //Run the program and click on the above drop down arror debug configration , enter the value in the edit configration.

    {
        for (int i = 0; i < gajanan.length; i++) {
            System.out.println(gajanan[i]);
        }
        System.out.println("-----------");
        for (String arg : gajanan) {
            System.out.println(arg);
        }

    }
}
