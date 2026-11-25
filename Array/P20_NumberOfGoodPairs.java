public class P20_NumberOfGoodPairs {
    static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})); // 4
        System.out.println("Test 2: " + sol.numIdenticalPairs(new int[]{1, 1, 1, 1}));       // 6
        System.out.println("Test 3: " + sol.numIdenticalPairs(new int[]{1, 2, 3}));          // 0
    }
}
