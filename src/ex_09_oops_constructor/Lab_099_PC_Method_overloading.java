package ex_09_oops_constructor;

public class Lab_099_PC_Method_overloading {
    public static void main(String[] args) {
        Sport1 sportplayer= new Sport1("gajanan","Cricket");
       // Sport1 sportplayer2= new Sport1("Raju","football");
        Sport1 sportplayer2= new Sport1("shiwani","vollyball","cricket_tshirt",400,8767643922L);
        System.out.println(sportplayer.player);
        System.out.println(sportplayer.sport_name);
        System.out.println(sportplayer2.sport_name);
        System.out.println(sportplayer2.player);
        System.out.println(sportplayer2.mobile_number);
        System.out.println(sportplayer2.roll_number);
        System.out.println(sportplayer2.T_ShirtName);
    }
}

class Sport1
{
    String player;
    String sport_name;
    String T_ShirtName;
    int roll_number;
    long mobile_number;


    Sport1 (String player_name)
    {
        this.player=player_name;

    }

    Sport1(String player_name1,String sport_name_user)
    {
        this.player=player_name1;
        this.sport_name=sport_name_user;

    }
    Sport1(String player_name2,String sport_name2,String T_shirtName_user,int roll_number_user,long mobile_number_user)
    {
        this.player=player_name2;
        this.sport_name=sport_name2;
        this.T_ShirtName=T_shirtName_user;
        this.roll_number=roll_number_user;
        this.mobile_number=mobile_number_user;
    }
}



