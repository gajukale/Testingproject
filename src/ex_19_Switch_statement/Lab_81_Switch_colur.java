package ex_19_Switch_statement;

public class Lab_81_Switch_colur
{
    public static void main(String[] args) {

        String color = "Red";

        switch (color)
        {
            case "Red":
                System.out.println("Red color");
                break;

            case "Blue":
                    System.out.println("Blue color");
                    break;
            default:
                System.out.println("Unknown color");
                break;


        }
    }
}
