import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        int[] freq = new int[10];

        // process input1
        if (input1 == 0) freq[0]++;
        while (input1 > 0) {
            freq[input1 % 10]++;
            input1 /= 10;
        }

        // process input2
        if (input2 == 0) freq[0]++;
        while (input2 > 0) {
            freq[input2 % 10]++;
            input2 /= 10;
        }

        // process input3
        if (input3 == 0) freq[0]++;
        while (input3 > 0) {
            freq[input3 % 10]++;
            input3 /= 10;
        }

        // process input4
        if (input4 == 0) freq[0]++;
        while (input4 > 0) {
            freq[input4 % 10]++;
            input4 /= 10;
        }

        int maxFreq = -1;
        int resultDigit = 0;

        // find most frequent digit (tie → higher digit)
        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                resultDigit = i;
            } else if (freq[i] == maxFreq && i > resultDigit) {
                resultDigit = i;
            }
        }

        System.out.println(resultDigit);
        sc.close();
    }
}
