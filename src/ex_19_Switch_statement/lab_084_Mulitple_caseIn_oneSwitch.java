package ex_19_Switch_statement;

public class lab_084_Mulitple_caseIn_oneSwitch
{
    public static void main(String[] args) {
        int day=1;
        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Day");
                break;


        }
    }
}
