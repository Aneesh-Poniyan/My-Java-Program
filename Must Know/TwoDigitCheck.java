import java.util.Scanner;

public class TwoDigitCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = Math.abs(number);

        if (n >= 10 && n <= 99) {
            System.out.println("Two digit number");
        } else {
            System.out.println("Not a two digit number");
        }

        sc.close();
    }
}
