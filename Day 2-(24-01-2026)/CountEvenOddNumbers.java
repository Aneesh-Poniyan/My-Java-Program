import java.util.Scanner;

public class CountEvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();
        int input5 = sc.nextInt();
        String input6 = sc.next();

        int count = 0;

        if (input1 % 2 == 0) {
            count++;
        }
        if (input2 % 2 == 0) {
            count++;
        }
        if (input3 % 2 == 0) {
            count++;
        }
        if (input4 % 2 == 0) {
            count++;
        }
        if (input5 % 2 == 0) {
            count++;
        }
        if (input6.equalsIgnoreCase("even")) {
            System.out.print(count);
        }else{
            System.out.println(5-count);
        }
        sc.close();
    }
}