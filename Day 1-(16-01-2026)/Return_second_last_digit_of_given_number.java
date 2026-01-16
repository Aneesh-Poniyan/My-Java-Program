import java.util.Scanner;

public class Return_second_last_digit_of_given_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();

        int secondLast = Math.abs((input1 / 10) % 10);

        System.out.println(secondLast);

        sc.close();
    }
}
