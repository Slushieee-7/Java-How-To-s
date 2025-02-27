public class Insertion {
    // Method to perform insertion sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        // Traverse through 1 to n
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Current element to be inserted
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key; // Insert the key at the correct position

            // Print the array after each insertion
            System.out.print("Step " + i + ": ");
            printArray(array);
        }
    }

    public static void printArray(int[] array) { //function to print the array
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        printArray(array);

        insertionSort(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}