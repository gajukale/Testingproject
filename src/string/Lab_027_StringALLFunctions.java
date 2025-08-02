package string;

public class Lab_027_StringALLFunctions {
    public static void main(String[] args) {
        String name = "Gajanan";//0,1,2,3,4,5,6
        System.out.println(name.length());
        System.out.println(name.charAt(3));//A
        //System.out.println(name.charAt(7));//StringIndexOutOfboundExcepctions
        System.out.println(name.concat(("patel")));

        //contains()
        System.out.println(name.contains("kale"));

        //equal
        System.out.println(name.equals("Gajanan"));
        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("gajanan"));
        //IndexOf
        System.out.println(name.indexOf('n'));

        String s1 = "madam";
        //Returns the index within this string of the
        //first occurance of the specified substring
        System.out.println(s1.indexOf('m'));
        System.out.println(s1.lastIndexOf("m"));
        //length
        System.out.println(name.length());
        //Replace
        System.out.println(name.replace('n', 'N'));

//split
        String name4 = "gajanan@kale.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

//substring
        System.out.println(name.substring(1, 3));
        //toLowercase
        System.out.println("Gajanan".toLowerCase());
        //toUppercase
        System.out.println("Gajanan".toUpperCase());
        //startwith
        System.out.println(name.startsWith("G"));//True
        //Endwith
        System.out.println(name.endsWith("n"));
        String anotherPalindrome = "Niagara. o roar age";
        System.out.println(anotherPalindrome.length());
        String extract = anotherPalindrome.substring(11, 15);
        System.out.println(extract);
        //Concatenation


    }
}
