import java.util.Scanner;

public class FirstDigitOfThreeDigitNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int firstDigit = Math.abs(number) / 100;
        System.out.println(firstDigit);

        sc.close();
    }
}
