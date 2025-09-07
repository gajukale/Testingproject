package ex_19_Switch_statement;

public class Lab_083_Switch_Omitted {
    public static void main(String[] args)
    {
        int day =1;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                //Break statment is omitted
            case 2:
                System.out.println("Tuesday");
            default:
                System.out.println("Invalid day");
        }

    }
}
