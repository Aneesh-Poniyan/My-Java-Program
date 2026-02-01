import java.util.Scanner;

public class PalindromePossible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] freq = new int[10];

        // Count digit frequencies
        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num = num / 10;
        }

        int oddCount = 0;

        // Count digits with odd frequency
        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("Palindrome Possible");
        } else {
            System.out.println("Palindrome Not Possible");
        }

        sc.close();
    }
}
