//For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.
//
//
//
//Example 1:
//
//Input: s = "III"
//Output: 3
//Example 2:
//
//Input: s = "IV"
//Output: 4
//Example 3:
//
//Input: s = "IX"
//Output: 9
//Example 4:
//
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
//Example 5:
//
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

import java.util.Map;
import java.util.HashMap;

public class RomanToInteger {
    // first Map the Roman value in static map
    static Map<String, Integer> value = new HashMap<>();
    static {
        value.put("I",1);
        value.put("V",5);
        value.put("X",10);
        value.put("L",50);
        value.put("C",100);
        value.put("D",500);
        value.put("M",1000);
    }
    //solution 1
    public int romanToInt(String s) {
        //declare sum and i
       int sum = 0;
       int i = 0;

       while(i < s.length()){
           // get symbol and get value
           String currentSymbol = s.substring(i, i+1);
           int currentValue = value.get(currentSymbol);
           int nextValue = 0;
           // get next value
           if(i+1 < s.length()){
               currentSymbol = s.substring(i+1, i+2);
               nextValue = value.get(currentSymbol);
           }

           if(currentValue < nextValue){
               sum += (nextValue - currentValue);
               i += 2;
           }
           else{
               sum += currentValue;
               i += 1;
           }
       }
    return sum;
    }

}
