package dowhileloop;

public class Lab_0010_dowhileloop {
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("This is the body, which will execute 1st time");
            System.out.println(a);
            a++;
        } while (a < 10);  // ← This should be outside the `do` block
    }
}
