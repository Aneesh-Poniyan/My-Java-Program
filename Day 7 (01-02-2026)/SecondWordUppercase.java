import java.util.Scanner;

public class SecondWordUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split(" ");

        if (words.length < 2) {
            System.out.println("LESS");
        } else {
            System.out.println(words[1].toUpperCase());
        }

        sc.close();
    }
}
