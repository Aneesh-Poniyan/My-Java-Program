import java.util.Scanner;

public class EvenOddDigitsSum {
    public static int evenOddDigitsSum(int n, String option) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (option.equalsIgnoreCase("even")) {
                if (digit % 2 == 0) {
                    sum += digit;
                }
            } else if (option.equalsIgnoreCase("odd")) {
                if (digit % 2 != 0) {
                    sum += digit;
                }
            }
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();      // input1
        String option = sc.next();      // "even" or "odd"

        int result = evenOddDigitsSum(number, option);
        System.out.println(result);

        sc.close();
    }
}
