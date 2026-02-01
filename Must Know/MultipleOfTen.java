import java.util.Scanner;

public class MultipleOfTen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 10 == 0) {
            System.out.println("Multiple of 10");
        } else {
            System.out.println("Not a multiple of 10");
        }

        sc.close();
    }
}
