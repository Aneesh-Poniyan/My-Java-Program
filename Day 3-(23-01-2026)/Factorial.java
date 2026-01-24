import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int factorial = 1;

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
        } else {
            while (n > 0) {
                factorial = factorial * n;
                n--;
            }
            System.out.println(factorial);
        }

        sc.close();
    }
}
