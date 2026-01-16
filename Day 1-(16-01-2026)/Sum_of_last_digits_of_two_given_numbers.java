import java.util.Scanner;
public class Sum_of_last_digits_of_two_given_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        int x = Math.abs(input1%10);
        int y = Math.abs(input2%10);
        System.out.println(x+y);  
        sc.close();
    }
}
