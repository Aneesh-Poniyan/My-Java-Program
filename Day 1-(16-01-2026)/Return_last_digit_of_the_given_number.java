import java.util.Scanner;
public class Return_last_digit_of_the_given_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int a = input1;
        int x = Math.abs(a % 10);
        System.out.println(x);
        sc.close();
    }
}
