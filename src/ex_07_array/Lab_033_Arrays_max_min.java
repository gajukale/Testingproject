package ex_07_array;

public class Lab_033_Arrays_max_min
{
    public static void main(String[] args)
    {
        int arrays [] = {25,14,56,15,36,56,77,18,29};
//        Arrays.sort(arrays);
//        System.out.println(arrays[arrays.length-1]);
        int max_output =give_me_max(arrays);
        int min_output =give_me_min(arrays);

        System.out.println(max_output);
        System.out.println(min_output);
    }

    static int give_me_max(int []array) {
        int max = array[0];//first number is max
        //logic
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }
    static int give_me_min(int []array) {
        int min = array[0];//first number is max
        //logic
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }
}
