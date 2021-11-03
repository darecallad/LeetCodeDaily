package algorithms;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class TryStack {
    private int count = 0;
    private int[] arr = new int[5];

    public void push(int item){
        if(count == arr.length) throw new IllegalStateException();
        arr[count++] = item;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public int pop(){
        if(isEmpty()) throw new IllegalStateException();
        return arr[--count];
    }
    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        return arr[count - 1];
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(arr,0,count);
        return Arrays.toString(content);
    }
}
