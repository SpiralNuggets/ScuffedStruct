import java.util.Iterator;

public class LList<T> implements Iterable<T> {
    private class Node<T>{
        T data;
        Node<T> next;
    }
    Node<T> head;

    private class LListIterator implements Iterator<T>{ //make remove() less of a pain
        Node<T> current;
        public LListIterator(){
            current = head;
        }
        public boolean hasNext(){
            return current != null;
        }
        public T next(){
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    public Iterator<T> iterator(){
        return new LListIterator();
    }

    public LList(){
        head = null;
    }

    public void add(T item){
        Node<T> newNode = new Node<T>();
        newNode.data = item;
        newNode.next = head;
        head = newNode;
    }
    
    public T get(int index){
        Node<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    public void remove(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node<T> current = head;
            for(int i = 0; i < index - 1; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public int size(){
        int size = 0;
        Node<T> current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){return false;}

    @Override
    public String toString(){
        String str = "";
        Node<T> current = head;
        while(current != null){
            str += current.data + " ";
            current = current.next;
        }
        return str;
    }
}
