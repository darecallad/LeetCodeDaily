package algorithms;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class TryStack {
    private int[] arr = new int[5];
    private int count = 0;
    public TryStack(){}
    public boolean isEmpty(){
        return count == 0;
    }
    public void push(int item){
        if(count == arr.length ){
            int[] newarr = new int[arr.length * 2];
            for(int i = 0; i < count ; i ++){
                newarr[i] = arr[i];
            }
            arr = newarr;
        }
        arr[count++] = item;
    }
    public int pop(){
        if(isEmpty()) throw new NoSuchElementException();
        return arr[--count];
    }
    public int peek(){
        if(isEmpty()) throw new NoSuchElementException();
        return arr[count -1];
    }
    @Override
    public String toString(){
        var content = Arrays.copyOfRange(arr,0,count);
        return Arrays.toString(content);
    }
}
