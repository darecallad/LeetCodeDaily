package algorithms;

import java.util.NoSuchElementException;

public class Linklist1 {
    // Node class inside Linklist
    private class Node{
        int value;
        Node next;
        public Node(){}
        public Node(int value){
            this.value = value;
        }
    } // end Node class

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty(){
        return first == null;
    }
    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = last;
            last = node;
        }
        size++;
    }
    public int indexOf(int item){
        if(isEmpty()) throw new NoSuchElementException();
        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();
        if(isOne()){
            first = last = null;
            size--;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }
    private boolean isOne(){
        return first == last;
    }
    public void removeLast(){
        if(isEmpty()) throw new NoSuchElementException();
        if(isOne()){
            first = last = null;
            size--;
        }
        var previous = getPrevious(last);
        previous.next = null;
        size--;
    }
    private Node getPrevious(Node node){
        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }
    public int size(){
        return size;
    }
    public int[] toArray(){
        int[] array = new int[size];
        int index = 0;
        var current = first;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
}
