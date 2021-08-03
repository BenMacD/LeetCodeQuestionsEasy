class Solution {
    
    static Map<String, Integer> romanNumerals = new HashMap<>();
        static {
            romanNumerals.put("i", 1);
            romanNumerals.put("v", 5);
            romanNumerals.put("x", 10);
            romanNumerals.put("l", 50);
            romanNumerals.put("c", 100);
            romanNumerals.put("d", 500);
            romanNumerals.put("m", 1000);
        }
    
    public int romanToInt(String s) {
        String lastSymbol = s.substring(s.length()-1);
        int lastValue = romanNumerals.get(lastSymbol.toLowerCase());
        int total = lastValue;
        
        for(int i = s.length()-2; i>= 0; i--) {
            String currentSymbol = s.substring(i, i+1);
            int currentValue = romanNumerals.get(currentSymbol.toLowerCase());
            if(currentValue < lastValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            lastValue = currentValue;
        }
        return total;
        
    }
}
