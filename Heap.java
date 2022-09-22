public class Heap {
    static int MAX_SIZE = 100;
    int heap[];
    int size = 0;

    public Heap() {
        heap = new int[MAX_SIZE];
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void insert(int d){
        int p = size++;
        heap[p] = d;
        int parent = (p-1)/2;
        while((p>0)&&(heap[p]<heap[parent])){
            swap(p, parent);
            p = parent;
            parent = (p-1)/2;
        }
    }
    public int remove(){
        int d = heap[0];
        heap[0] = heap[--size];
        int p = 0;
        while(true){
            int left = 2*p+1;
            int right = 2*p+2;
            if(left>=size) break; //no child?
            if(right==size){ //one child
                    if(heap[p]>heap[left])
                        swap(p, left);
            }
            else{ //two children
                int q = heap[left]<heap[right]?left:right;
                if(heap[p]>heap[q])
                    swap(p, q);
                else
                    break;
                p = q;
            }
        }
        return d;
    }

    public int peek(){
        return heap[0];
    }

    public boolean isFull(){
        return size == MAX_SIZE;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i: heap){
            s += i + " ";
        }
        return s;
    }
    
}
