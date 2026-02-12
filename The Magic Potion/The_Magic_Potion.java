/*

In a mystical land, an alchemist is trying to create the most powerful potion. The potion is made by combining different ingredients. Each ingredient has a specific power value.
The alchemist can combine the ingredients in any order, but the rule of the potion is as follows:
The power of the potion is the sum of all ingredient powers multiplied by the number of ingredients.
Your task is to determine the maximum power of the potion given the power values of the ingredients.

Input
•	The first line contains an integer N — the number of ingredients.
•	The second line contains N space-separated integers a1, a2, ..., aN — the power values of the ingredients.

Output
•	Print a single integer — the maximum power of the potion.

Constraints
•	1 ≤ N ≤ 10^5
•	0 ≤ ai ≤ 10^4

Examples:

Example 1
Input
4
1 2 3 4
Output
40

Example 2
Input
3
10 20 30
Output
180

*/

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





