import java.util.ArrayList;
import java.util.List;

public class knapsack {
    private static int[] values = {80, 100, 140, 160, 40, 100, 200, 440, 60, 120};
    private static int[] weights = {4, 5, 7, 8, 2, 5, 10, 22, 3, 6};
    private static int capacity = 10;

    private static int knapsackTabulation() {
        int n = values.length;
        int[][] tab = new int[n + 1][capacity + 1];

        // Populate the DP table
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    int includeItem = values[i - 1] + tab[i - 1][w - weights[i - 1]];
                    int excludeItem = tab[i - 1][w];
                    tab[i][w] = Math.max(includeItem, excludeItem);
                } else {
                    tab[i][w] = tab[i - 1][w];
                }
            }
        }

        // Print the DP table
        for (int[] row : tab) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Backtrack to find the items included
        List<Integer> itemsIncluded = new ArrayList<>();
        int w = capacity;
        for (int i = n; i > 0; i--) {
            if (tab[i][w] != tab[i - 1][w]) {
                itemsIncluded.add(i - 1);
                w -= weights[i - 1];
            }
        }

        System.out.println("\nItems included: " + itemsIncluded);

        return tab[n][capacity];
    }

    public static void main(String[] args) {
        System.out.println("\nMaximum value in Knapsack = " + knapsackTabulation());
    }
}