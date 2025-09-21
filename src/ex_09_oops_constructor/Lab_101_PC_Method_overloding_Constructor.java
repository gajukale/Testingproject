package ex_09_oops_constructor;

public class Lab_101_PC_Method_overloding_Constructor
{
    public static void main(String[] args)
    {
        India_team player = new India_team("Gajanan", "dhoni");
        India_team player2 = new India_team("Raju", "virat", "PUjara","Gaju", 90);

        System.out.println("Player 1: " + player.player + ", Batsman: " + player.batsman); // shows fields set by constructor
        System.out.println("Player 2: " + player2.player + ", Batsman: " + player2.batsman);
        System.out.println("Player 3: " + player2.Wk + " , Bollowser_Name: " + player2.Bollowser + " , Thirt no: " + player2.T_shirt_number);
    }
}

class India_team {
    String player;
    String Wk;
    String batsman;
    String Bollowser;
    int T_shirt_number;

    // Correct 5-argument constructor
    India_team(String player_name, String Wk_name, String batsman_name, String Bollowser_name, int T_shirt_number_user)
    {
        this.player = player_name;
        this.Wk = Wk_name;
        this.batsman = batsman_name;
        this.Bollowser = Bollowser_name;
        this.T_shirt_number = T_shirt_number_user;
    }

    // Overloaded 2-argument constructor
    India_team(String player_name2, String batsman_name2)
    {
        this.player = player_name2;
        this.batsman = batsman_name2;
    }
}
