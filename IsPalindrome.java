class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long result = 0;
        int original = x;
        for(; x!=0; x/=10) {
            result = (result*10) + (x % 10);
        }
        return (int)result == original;
    }
}
