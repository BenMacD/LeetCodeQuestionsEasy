class Solution {
    //Given a roman numeral, convert it to an integer.
    
    public static Map<String, Integer> romanNumerals;
    static {
        romanNumerals = new HashMap<>();
        romanNumerals.put("i", 1);
        romanNumerals.put("v", 5);
        romanNumerals.put("x", 10);
        romanNumerals.put("l", 50);
        romanNumerals.put("c", 100);
        romanNumerals.put("d", 500);
        romanNumerals.put("m", 1000);
    }
    
    public int romanToInt(String s) {
        System.out.println(s);
        String lower = s.toLowerCase();
        int index = 0;
        int result = 0;
        char[] values = lower.toCharArray();
        ArrayList<Integer> numericalValues = new ArrayList<>();
        //convert it to array of number values
        for(char value: values) {
            numericalValues.add(romanNumerals.get(String.valueOf(value)));
        }
        while(index < numericalValues.size()) {
            Integer firstValue = numericalValues.get(index);
            Integer secondValue = null;
            System.out.println("Index " +index);
            if(index+1 < numericalValues.size()) {
                secondValue = numericalValues.get(index+1);
            }
            if(secondValue==null) {
                result+=firstValue;
                index++;
            }
            else if(firstValue>=secondValue) {
                result += firstValue;
                index++;
            }
            else if(firstValue<secondValue) {
                result += (secondValue-firstValue);
                index += 2;
            }
        
        }
        return result;
        
    }
}
