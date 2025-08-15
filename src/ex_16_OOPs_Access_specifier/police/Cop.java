package ex_16_OOPs_Access_specifier.police;

public class Cop {
   public int gun ;
    String iCard;

    public Cop(int bullet)
    {
        this.gun= bullet;
    }
    //Method and Bhaviour
  protected void canIShoot ()//If its private or default it can not be a access in the thief class
    {
        System.out.println("Yes You can !!");
    }

    void thisDefaultF1()
    {
        System.out.println("Hi, COP");
    }


}
