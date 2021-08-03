/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
**/

class Solution {
    private HashMap<Character, Character> mappings;
    
    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put('}','{');
        this.mappings.put(']', '[');
        this.mappings.put(')', '(');
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#': stack.pop();
                
                if(topElement!=this.mappings.get(c)) {
                    //Not a close bracket
                    return false;
                }
                
                
            } else {
                //It is an opening bracket
                stack.push(c);
            }
            
        }
        return stack.isEmpty();
        
    }
}
