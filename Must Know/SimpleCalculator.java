import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println(a + b);
        } 
        else if (operator == '-') {
            System.out.println(a - b);
        } 
        else if (operator == '*') {
            System.out.println(a * b);
        } 
        else if (operator == '/') {
            if (b != 0) {
                System.out.println(a / b);
            } else {
                System.out.println("Division by zero not allowed");
            }
        } 
        else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
