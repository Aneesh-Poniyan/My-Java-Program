import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] ingredients = new int[N];
        for (int i = 0; i < N; i++) {
            ingredients[i] = sc.nextInt();
        }

        int result = maxPotionPower(ingredients);

        System.out.println(result);

        sc.close();
    }

    public static int maxPotionPower(int[] ingredients) {
        int sum = 0;
        for (int val : ingredients) {
            sum += val;
        }
        return sum * ingredients.length;
    }
}





