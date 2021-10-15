public class Implement {
    public int strStr(String haystack, String needle){

        // see if haystack contains needle
        if(haystack.contains(needle)){
            return  haystack.indexOf(needle);
        }
        else return -1;
    }
}
