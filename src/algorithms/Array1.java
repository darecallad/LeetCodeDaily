package algorithms;

public class Array1 {
    private int[] array;
    private int count;

    public Array1(int size){
        array = new int[size];
    }

    public void insert(int element){
        if(count == array.length){
            int[] newarray = new int[ count * 2 ];
            for(int i = 0; i < count; i++)
                newarray[i] = array[i];
            array = newarray;
        }
        array[count++] = element;
    }
    public void remove(int index){
        if( index < 0 || index >= count) throw new IllegalArgumentException();

        for( int i = index; i < count; i++)
            array[i] = array[i+1];
        count--;
    }
    public int indexOf(int element){
        for(int i =0; i < count; i++){
            if(array[i] == element) return i;
        }
        return -1;
    }
}
