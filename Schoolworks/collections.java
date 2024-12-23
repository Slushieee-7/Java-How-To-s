import java.util.*;

class CollectionsExample { // Renamed class to follow Java naming conventions

    public void arrayList(int x, int y) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        // Using enhanced for loop for better readability
        for (Integer num : list) {
            System.out.println(num);
        }
    }

    public void linkedList(int x, int y) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(x);
        list.add(y);
        // Using enhanced for loop for better readability
        for (Integer num : list) {
            System.out.println(num);
        }
    }

    public void vector(int x, int y) {
        Vector<Integer> v = new Vector<>();
        v.add(x);
        v.add(y);
        // Using enhanced for loop for better readability
        for (Integer num : v) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t Pick a collection: \n\t 1. ArrayList \n\t 2. LinkedList \n\t 3. Vector \n: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the first number you want to add in the ArrayList: ");
                int a = scanner.nextInt();
                System.out.println("Enter the second number you want to add in the ArrayList: ");
                int b = scanner.nextInt();
                CollectionsExample arrayListExample = new CollectionsExample();
                arrayListExample.arrayList(a, b);
                break;

            case 2:
                System.out.println("Enter the first number you want to add in the LinkedList: ");
                int c = scanner.nextInt();
                System.out.println("Enter the second number you want to add in the LinkedList: ");
                int d = scanner.nextInt();
                CollectionsExample linkedListExample = new CollectionsExample();
                linkedListExample.linkedList(c, d); // Fixed method call
                break;

            case 3:
                System.out.println("Enter the first number you want to add in the Vector: ");
                int e = scanner.nextInt();
                System.out.println("Enter the second number you want to add in the Vector: ");
                int f = scanner.nextInt();
                CollectionsExample vectorExample = new CollectionsExample();
                vectorExample.vector(e, f);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        scanner.close(); // Closed the scanner
    }
}