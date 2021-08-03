class Solution {
//Given an integer return true if it is a palindrome
    public boolean isPalindrome(int x) {
        int result = 0;
        int original = x;
        while(x!=0) {
            result = result*10 + x%10;
            x /= 10;
            System.out.println(x + " and " + result);
        }
        return result==original && original>=0;
    }
}
