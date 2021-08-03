//Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s.chars().filter(c -> Character.isLetterOrDigit(c)).mapToObj(c -> Character.toLowerCase((char) c)).forEach(c -> sb.append(c));
        
        return sb.toString().equals(sb.reverse().toString());
        
    }
}
