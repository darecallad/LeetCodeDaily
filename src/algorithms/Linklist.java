package algorithms;

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

    private boolean isEmpty(){
        return first == null;
    }

    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }
    public void addFirst( int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
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
        if(isEmpty()) throw new IllegalArgumentException();
        var second = first.next;
        first.next = null;
        first = second;
    }
}
