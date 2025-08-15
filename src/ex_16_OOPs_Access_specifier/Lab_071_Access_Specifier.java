package ex_16_OOPs_Access_specifier;

public class Lab_071_Access_Specifier
{
    public static void main(String[] args) {

    }
}
class Father
{
    private int gold =100;
    int car =1;
    public int bhk3=1;

}
class Son extends Father
{
  void weCanUse ()
  {
     // System.out.println(gold); Private account
      System.out.println(car);
      System.out.println(bhk3);
  }


}
