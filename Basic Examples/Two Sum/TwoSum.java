import java.util.HashMap;

public class TwoSum {
    public static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");//instead of using the return function
                                                                    //we would use the throw an exception to override the error
    }

    public static void main(String[] args) {
        int[] ans = twosum(new int[] {2, 4, 6, 7, 9, 21, 42, 12}, 9);
        System.out.println("Indexes: [" + ans[0] + ", " + ans[1] + "]");
    }
}
