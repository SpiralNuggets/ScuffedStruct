public class Queue<T> {
    private class Node<T>{
        T data;
        Node<T> next;
    }
    Node<T> head;

    public Queue(){
        head = null;
    }
    
    public void enqueue(T item){
        Node<T> newNode = new Node<T>();
        for(Node<T> current = head; current != null; current = current.next){
            if(current.next == null){
                current.next = newNode;
                newNode.data = item;
                newNode.next = null;
                return;
            }
        }
    }


    // will complete this later
}
