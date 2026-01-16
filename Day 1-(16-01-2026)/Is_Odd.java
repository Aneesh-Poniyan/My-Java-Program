import java.util.Scanner;
public class Is_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();

        if(input1 % 2 != 0){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
        sc.close();
    }
}
