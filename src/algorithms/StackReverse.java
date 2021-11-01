package algorithms;

import java.util.Stack;

public class StackReverse {
    public String reverse(String input){
        if(input == null) throw new IllegalArgumentException();
        Stack <Character> stack = new Stack<>();

        for(char ch : input.toCharArray())
            stack.push(ch);

        StringBuffer stb = new StringBuffer();
        while(!stack.isEmpty())
            stb.append(stack.pop());

        return stb.toString();
    }
}
