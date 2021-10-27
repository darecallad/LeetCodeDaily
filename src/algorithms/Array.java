package algorithms;

public class Array {
    private int[] array;
    private int count;

    public Array(int length){
        array = new int[length];
    }

    public void insert(int element){
        if(count == array.length){
            int[] newArray = new int[count * 2];
            for(int i = 0; i < count; i ++){
                newArray[i] = array[i];
                array = newArray;
            }
        }
        array[count++] = element;
    }
    public void remove(int index){
        if(index < 0 || index >= count) throw new IllegalArgumentException();
        for(int i = index; i < count; i++){
            array[i] = array[i+1];
        }
        count--;
    }
    public int indexOf(int element){
        for(int i = 0 ; i < count ; i++){
            if(array[i] == element) return i;
        }
        return -1;
    }
}
