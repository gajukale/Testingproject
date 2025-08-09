package array;

import java.util.Arrays;

public class Lab_041_LabArrayCopy
{
    public static void main(String[] args)
    {
        int [] orginal = {1,2,3};
        int [] copy= new int [orginal.length];
System.arraycopy(orginal,0,copy,0,orginal.length);
        System.out.println(Arrays.toString(copy));

    }
}
