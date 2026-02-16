import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println(area);

        sc.close();
    }
}
