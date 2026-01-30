import java.util.Scanner;

public class DigitSumSingleDigit {
    public static int digitSum(int n) {
        boolean isNegative = n < 0;
        n = Math.abs(n);

        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }

        return isNegative ? -n : n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = digitSum(input);
        System.out.println(result);

        sc.close();
    }
}
