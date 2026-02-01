import java.util.Scanner;

public class HillPatternWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int levels = sc.nextInt();        // input1
        int headWeight = sc.nextInt();    // input2
        int increment = sc.nextInt();     // input3

        int total = 0;

        for (int level = 1; level <= levels; level++) {
            int stars = level; // number of stars in that level
            int levelWeight = headWeight + (level - 1) * increment;
            total += stars * levelWeight;
        }

        System.out.println(total);

        sc.close();
    }
}
