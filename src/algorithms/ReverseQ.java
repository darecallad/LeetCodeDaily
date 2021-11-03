package algorithms;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQ {
    Queue<Integer> queue = new ArrayDeque<>();

    public void reverse(Queue<Integer> queue){
        Stack <Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());
        while(!stack.isEmpty())
            queue.add(stack.pop());
    }
}
