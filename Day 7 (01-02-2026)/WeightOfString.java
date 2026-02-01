import java.util.Scanner;

public class WeightOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // input string
        int option = sc.nextInt();    // 0 = ignore vowels, 1 = include vowels

        String word = input.toLowerCase();
        int total = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            // check if alphabet
            if (ch >= 'a' && ch <= 'z') {
                // check vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    if (option == 1) {
                        total += ch - 'a' + 1;
                    }
                }
                // consonant
                else {
                    total += ch - 'a' + 1;
                }
            }
        }

        System.out.println(total);
        sc.close();
    }
}
