import java.util.Scanner;

public class CountPrimesInRange {
    public static int countPrimesInRange(int start, int end) {
        int count = 0;
        for (int num = start; num <= end; num++) {
            if (num < 2)
                continue;

            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int result = countPrimesInRange(start, end);
        System.out.println(result);

        sc.close();
    }
}
