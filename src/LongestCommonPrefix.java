//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.


public class LongestCommonPrefix {

    // Solution 1 Horizaontal Scanning O(S)  s = all character
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];

        for(int i = 0; i < strs.length; i ++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length() -1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    //Solution 2 Vertical Scanning  O(S)
    public String longestCommonPrefixSo2 (String[] strs){
        if(strs == null || strs.length == 0) return "";
        for(int i = 0; i < strs[0].length(); i ++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j ++){
                if(i == strs[j].length() || strs[j].charAt(i) != c) return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}
