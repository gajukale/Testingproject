package ex_19_Switch_statement;

public class Lab_82_nested_switch {
    public static void main(String[] args) {
        int dayofWeek=2;
        int hourOfDay=14;
        switch (dayofWeek)
        {
            case 1:
                switch(hourOfDay)
                {
                    case 0:
                    case 1:
                    case 2:
                        System.out.println("Last sunday night");
                        break;
                    default :
                        System.out.println("Sunday daytime");
                        break;

                }
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid Day");
                break;

        }
    }
}
