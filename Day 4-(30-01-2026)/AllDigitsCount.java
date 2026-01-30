import java.util.Scanner;

public class AllDigitsCount {
    public static int allDigitsCount(int n) {
        int count = 0;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = allDigitsCount(input);
        System.out.println(result);

        sc.close();
    }
}
