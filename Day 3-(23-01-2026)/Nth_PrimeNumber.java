import java.util.Scanner;

public class Nth_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // position of prime (e.g., 10 → 29)

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            int count = 0;
            int num = 1;

            while (true) {
                num++;
                boolean isPrime = true;

                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i * i <= num; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    count++;
                }

                if (count == n) {
                    System.out.println(num);
                    break;
                }
            }
        }

        sc.close();
    }
}
