import java.util.*;

public class Kth {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Collections.sort(a); //sorts all collections stored in array a
        Collections.sort(b); //sorts all collections stored in array b

        int count = 0;
        int maxA = a.get(a.size() - 1);
        int minB = b.get(0);

        for (int i = maxA; i <= minB; i++) {
            boolean factorOfAllB = true;
            for (int val : b) {
                if (val % i != 0) {
                    factorOfAllB = false;
                    break;
                }
            }

            boolean multipleOfAllA = true;
            for (int val : a) {
                if (i % val != 0) {
                    multipleOfAllA = false;
                    break;
                }
            }

            if (factorOfAllB && multipleOfAllA) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        int result = getTotalX(a, b);
        System.out.println(result); 
    }
}