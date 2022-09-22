public class Stack<T> {
    private static int MAX_SIZE = 100;
    private T[] arr;
    private int size;

    public Stack() {
        arr = (T[]) new Object[MAX_SIZE];
        size = 0;
    }

    public void push(T item) {
        arr[size] = item;
        size++;
    }

    public T pop() {
        T item = arr[size - 1];
        size--;
        return item;
    }

    public T peek() {
        return arr[size - 1];
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == MAX_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
