package stringBUffervsstringBuilder;

import java.util.Scanner;

public class ReverseInterviewcoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = scanner.next();
        String newString_reversed = reverseStringsb(input);

        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    static String reverseStringsb(String UserInput) {
        String reversed = "";
        for (int i = UserInput.length() - 1; i >= 0; i--) {
            reversed = reversed + UserInput.charAt(i);
        }
        return reversed;
    }
}
