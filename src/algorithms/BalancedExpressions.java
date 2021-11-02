package algorithms;

import java.util.HashMap;
import java.util.Stack;

public class BalancedExpressions {

    HashMap<Character,Character> map;


    public BalancedExpressions(){
        this.map.put('<','>');
        this.map.put('(',')');
        this.map.put('[',']');
        this.map.put('{','}');
    }

    public boolean isValid(String input){
        if(input == null) throw new IllegalArgumentException();
        Stack <Character> stack = new Stack<>();
        for(char ch : input.toCharArray()) {
            if (this.map.containsKey(ch)) {
                char topelement = stack.isEmpty() ? '#' : stack.pop();
                if (topelement != this.map.get(ch)) return false;
            } else
                stack.push(ch);
        }
        return stack.isEmpty();
    }

}
