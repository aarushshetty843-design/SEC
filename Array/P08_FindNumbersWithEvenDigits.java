public class P08_FindNumbersWithEvenDigits {
    static class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int num : nums) {
                int digits = 0;
                int temp = num;
                while (temp > 0) {
                    digits++;
                    temp /= 10;
                }
                if (digits % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.findNumbers(new int[]{12, 345, 2, 6, 7896})); // 2
        System.out.println("Test 2: " + sol.findNumbers(new int[]{555, 901, 482, 1771}));  // 1
    }
}
