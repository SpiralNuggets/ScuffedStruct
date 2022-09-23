public class Array<T>{

    T[] arr;
    private static int MAX_SIZE = 100;
    int size;

    public Array(){
        arr = (T[]) new Object[MAX_SIZE];
        size = 0;
    }

    public void add(T item){
        if(!isFull()){
        arr[size] = item;
        size++;
        }
    }

    public T get(int index){
        return arr[index];
    }

    public int size(){
        return size;
    }

    public void remove(int index){
        for(int i = index; i < size; i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    public boolean isFull(){
        return size == MAX_SIZE;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        String str = "";
        for(T i: arr){
            str += i + " ";
        }
        return str;
    }
}
