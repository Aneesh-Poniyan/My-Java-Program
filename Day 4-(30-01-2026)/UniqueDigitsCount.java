import java.util.Scanner;

public class UniqueDigitsCount {
    public static int uniqueDigitsCount(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = uniqueDigitsCount(input);
        System.out.println(result);

        sc.close();
    }
}
