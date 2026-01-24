import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            int a = 0;
            int b = 1;
            int next = 0;

            for (int i = 3; i <= n; i++) {
                next = a + b;
                a = b;
                b = next;
            }

            System.out.println(next);
        }

        sc.close();
    }
}
