package algorithms;

import java.util.NoSuchElementException;

public class Linklist {

    private class Node {
        int value;
        Node next;

        public Node(){}
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node first;
    private Node last;
    private int count;

    private boolean isEmpty(){
        return first == null;
    }
    private boolean oneNode(){
        return first == last;
    }

    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
        count++;
    }
    public void addFirst( int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        count++;
    }
    public int indexOf( int item){
        if(isEmpty()) return -1;
        int index = 0;
        var current = first;
        while(current != null){
            if(current.value == item) return index;
            else{
                current = current.next;
                index++;
            }
        }
        return -1;
    }
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();
        if(oneNode()){
            first = last = null;
            count--;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        count--;
    }
    public void removeLast(){
        if(isEmpty()) throw new NoSuchElementException();
        if(oneNode()){
            first = last = null;
            count--;
            return;
        }
        var current = first;
        while(current.next != null){
            current = current.next;
        }
        current.next = null;
        count--;
    }
    public int size(){
        return count;
    }
}
