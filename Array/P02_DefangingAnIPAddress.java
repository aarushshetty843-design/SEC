public class P02_DefangingAnIPAddress {
    static class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Test 1: " + sol.defangIPaddr("1.1.1.1"));       // 1[.]1[.]1[.]1
        System.out.println("Test 2: " + sol.defangIPaddr("255.100.50.0"));  // 255[.]100[.]50[.]0
    }
}
