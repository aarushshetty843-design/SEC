
public class P13_CountDigitsThatDivideNumber{
    static class Solution {
        public int countDigits(int num) {
            int count = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit != 0 && num % digit == 0) {
                    count++;
                }
                temp /= 10;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1 (7):    " + sol.countDigits(7));    // 1
        System.out.println("Test 2 (121):  " + sol.countDigits(121));  // 2
        System.out.println("Test 3 (1248): " + sol.countDigits(1248)); // 4
    }
}
