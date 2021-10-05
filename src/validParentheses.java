//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.

import java.util.HashMap;
import java.util.Stack;

public class validParentheses {
    // init Hash Table
    HashMap<Character,Character> map;

    // mapping the character
    public validParentheses(){
        this.map = new HashMap<Character, Character>();
        this.map.put(')','(');
        this.map.put('}','{');
        this.map.put(']','[');
    }

    public boolean isValid(String s){
        // init Stack
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);

            // if stack empty put dummy value otherwise get the pop value
            if(this.map.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();

                if(topElement != this.map.get(c)) return false;
        }
            else stack.push(c);
    }
        return stack.isEmpty();
}}
