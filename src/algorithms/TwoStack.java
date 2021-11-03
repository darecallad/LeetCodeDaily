package algorithms;

public class TwoStack {
    private int[] arr1 = new int[5];
    private int[] arr2 = new int[5];
    private int count1, count2 = 0;

    public boolean isEmpty1(){
        return count1 == 0;
    }
    public boolean isEmpty2(){
        return count2 == 0;
    }
    public void push1(int item){
        if(count1 == arr1.length) throw new IllegalStateException();
        arr1[count1++] = item;
    }
    public void push2(int item){
        if(count2 == arr2.length) throw new IllegalStateException();
        arr2[count2++] = item;
    }
    public int pop1(){
        if(isEmpty1()) throw new IllegalStateException();
        return arr1[--count1];
    }
    public int pop2(){
        if(isEmpty2()) throw new IllegalStateException();
        return arr2[--count2];
    }
    public int peek1(){
        if(isEmpty1()) throw new IllegalStateException();
        return arr1[count1 - 1];
    }
    public int peek2(){
        if(isEmpty2()) throw new IllegalStateException();
        return arr2[count2 - 1];
    }
}
