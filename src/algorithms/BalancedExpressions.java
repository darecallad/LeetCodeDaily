package algorithms;

import java.util.HashMap;
import java.util.Stack;

public class BalancedExpressions {

    HashMap<Character,Character> map;

    public BalancedExpressions(){
        this.map = new HashMap<Character, Character>();
        this.map.put(')','(');
        this.map.put('}','{');
        this.map.put(']','[');
        this.map.put('>','<');
    }


    public boolean balancedExpressions(String input){
        char topelement;
        if(input == null) throw new IllegalArgumentException();
        Stack <Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            if(this.map.containsKey(ch)) {
                topelement = stack.empty() ? '#' : stack.pop();
                if(topelement != this.map.get(ch)) return false;
            }
            else
                stack.push(ch);
        }
        return stack.isEmpty();
    }
}
