package ex_09_oops_constructor;

public class Lab100_PC_Method_Overloading1 {
    public static void main(String[] args) {
        Cricket WK=new Cricket("Dhoni","India");
        Cricket bollwer = new Cricket("Gambhir","India","789","Fast bollower",777);
        Cricket batsman= new Cricket("Rohit","India","78");
        System.out.println("Wicket_keeper Name : "+ WK.sport_name + " " +  "\n Team Name :  " + WK.Team_name);
        System.out.println("Bolwer name : " + bollwer.sport_name + " " + "\nTeam name :  " + bollwer.Team_name + " " +  "\nsport_id : "+ bollwer.sport_id + " "+ " \n Roll : " + bollwer.roll + " "+  "\nT shirt number :  "+ bollwer.T_shirt_number);
        System.out.println("Batsman : " + batsman.sport_name + " "+ "\nTeam name : " + batsman.Team_name + " "+ "\nSport id :  " + batsman.sport_id);
    }
}

class Cricket {

    String sport_name;
    String Team_name;
    String sport_id;
    String roll;
    int T_shirt_number;



    //PC
    Cricket (String sport_name_player,String Team_name_Player)
    {
        this.sport_name=sport_name_player;
        this.Team_name=Team_name_Player;

    }
    Cricket(String sport_name_player2,String Team_name_player2,String sport_id_player)
    {
        this.sport_name=sport_name_player2;
        this.Team_name=Team_name_player2;
        this.sport_id=sport_id_player;
    }
    Cricket(String sport_name_player3,String Team_name_player3,String sport_id_player3,String roll_player,int T_shirt_number_player)
    {
        this.sport_name=sport_name_player3;
        this.Team_name=Team_name_player3;
        this.sport_id=sport_id_player3;
        this.roll=roll_player;
        this.T_shirt_number=T_shirt_number_player;
    }

}
