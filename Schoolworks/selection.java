public class selection {
    public static void main(String[] args) {
        int[] my_array = {2, 6, 4, 7, 12, 4, 8, 10, 131, 9};
        int n = my_array.length;

        System.out.print("Initial array: ");
        for (int value : my_array) {
            System.out.print(value + " ");
        }
        System.out.println();

        int step = 1; // Initialize step counter
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            // Find the index of the minimum value in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (my_array[j] < my_array[min_index]) {
                    min_index = j;
                }
            }

            // Swap the found minimum value with the first element of the unsorted part
            int min_value = my_array[min_index];
            for (int k = min_index; k > i; k--) {
                my_array[k] = my_array[k - 1]; // Shift elements to the right
            }
            my_array[i] = min_value; // Place the minimum value at the beginning

            // Display the array after each step
            System.out.print("Step " + step + ": ");
            for (int value : my_array) {
                System.out.print(value + " ");
            }
            System.out.println();
            step++; // Increment the step counter
        }

        // Final sorted array display
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}