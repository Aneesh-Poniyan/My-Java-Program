import java.util.Scanner;

public class SumOfTwoDigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = Math.abs(number);

        int tens = n / 10;
        int ones = n % 10;
        int sum = tens + ones;

        System.out.println(sum);

        sc.close();
    }
}
