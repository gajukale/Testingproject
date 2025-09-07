package ex_19_Switch_statement;

public class Lab_80_Switch_Day {
    public static void main(String[] args) {

        int day=6;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;


            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default :
                System.out.println("Invalid day");
                break;

        }
    }
}
