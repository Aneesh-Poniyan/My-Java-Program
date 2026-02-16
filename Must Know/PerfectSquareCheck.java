import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int root = (int) Math.sqrt(number);

        if (root * root == number) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }

        sc.close();
    }
}
