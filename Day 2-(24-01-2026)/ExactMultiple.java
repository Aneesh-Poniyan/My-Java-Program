import java.util.Scanner;

public class ExactMultiple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        if (input1 == 0 || input2 == 0) {
            System.out.println("Either of the inputs is zero");
        } 
        else if (input1 % input2 == 0) {
            System.out.println("Input1 is an exact multiple of Input2");
        } 
        else {
            System.out.println("Input1 is not a multiple of Input2");
        }

        sc.close();
    }
}
