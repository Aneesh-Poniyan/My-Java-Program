import java.util.Scanner;

public class OddDigitsSum {
    public static int oddDigitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;

            if (digit % 2 != 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int result = oddDigitsSum(input);

        System.out.println(result);

        sc.close();
    }
}
