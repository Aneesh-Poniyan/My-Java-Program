import java.util.Scanner;

public class ReverseTwoDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int last = num % 10;
        int first = num / 10;

        int reverse = last * 10 + first;

        System.out.println(reverse);

        sc.close();
    }
}
