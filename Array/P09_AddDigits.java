public class P09_AddDigits {
    static class Solution {
        public int addDigits(int num) {
            while (num >= 10) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }
            return num;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1 (38): " + sol.addDigits(38)); // 2
        System.out.println("Test 2 (0):  " + sol.addDigits(0));  // 0
    }
}
