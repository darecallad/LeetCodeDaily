// return the last length of word
// "Hello World" return 5.
public class LengthofLastWord {
    public int lengthoflastword(String s){
        // two loops
        int p = s.length() -1;
        // deak with space
        while(p >= 0 && s.charAt(p) == ' '){
            p--;
        }
        // last word
        int length = 0;
        while(p >= 0 && s.charAt(p) != ' '){
            p--;
            length++;
        }
        return length;
    }

    //solution 2
    public int lengthoflastword1(String s){
        // one loop
        int p = s.length();
        int length = 0;

        while(p > 0){
            p--;
            if(s.charAt(p) != ' ') length++;
            else if(length > 0) return length;
        }
        return length;
    }
}
