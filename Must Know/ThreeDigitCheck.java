import java.util.Scanner;

public class ThreeDigitCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = Math.abs(number);

        if (n >= 100 && n <= 999) {
            System.out.println("Three digit number");
        } else {
            System.out.println("Not a three digit number");
        }

        sc.close();
    }
}
