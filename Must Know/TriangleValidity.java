import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        int sum = angle1 + angle2 + angle3;

        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }

        sc.close();
    }
}
