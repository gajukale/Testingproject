import java.util.Scanner;

public class Lab_007_while_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }

        int number = scanner.nextInt();
        long factorial = 1;

        if (number < 0) {
            System.out.println("Negative factorial is not allowed");
            return;
        }

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial --> " + factorial);
    }
}
