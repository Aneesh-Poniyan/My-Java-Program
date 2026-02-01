import java.util.Scanner;

public class CreatePIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        // Extract digits of input1
        int unit1 = input1 % 10;
        int tens1 = (input1 / 10) % 10;
        int hundreds1 = input1 / 100;

        // Extract digits of input2
        int unit2 = input2 % 10;
        int tens2 = (input2 / 10) % 10;
        int hundreds2 = input2 / 100;

        // Extract digits of input3
        int unit3 = input3 % 10;
        int tens3 = (input3 / 10) % 10;
        int hundreds3 = input3 / 100;

        // Minimum of unit digits
        int minUnit = unit1;
        if (unit2 < minUnit) minUnit = unit2;
        if (unit3 < minUnit) minUnit = unit3;

        // Minimum of tens digits
        int minTens = tens1;
        if (tens2 < minTens) minTens = tens2;
        if (tens3 < minTens) minTens = tens3;

        // Minimum of hundreds digits
        int minHundreds = hundreds1;
        if (hundreds2 < minHundreds) minHundreds = hundreds2;
        if (hundreds3 < minHundreds) minHundreds = hundreds3;

        // Maximum of all digits
        int maxDigit = unit1;

        if (tens1 > maxDigit) maxDigit = tens1;
        if (hundreds1 > maxDigit) maxDigit = hundreds1;

        if (unit2 > maxDigit) maxDigit = unit2;
        if (tens2 > maxDigit) maxDigit = tens2;
        if (hundreds2 > maxDigit) maxDigit = hundreds2;

        if (unit3 > maxDigit) maxDigit = unit3;
        if (tens3 > maxDigit) maxDigit = tens3;
        if (hundreds3 > maxDigit) maxDigit = hundreds3;

        // Create PIN
        int pin = maxDigit * 1000 + minHundreds * 100 + minTens * 10 + minUnit;

        System.out.println(pin);

        sc.close();
    }
}
