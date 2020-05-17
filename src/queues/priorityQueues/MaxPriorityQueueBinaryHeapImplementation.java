package queues.priorityQueues;

public class MaxPriorityQueueBinaryHeapImplementation <Key extends Comparable<Key>> {
    private int N;
    private Key[] pq;

    public MaxPriorityQueueBinaryHeapImplementation(int capacity){
        N = 0;
        pq = (Key[]) new Comparable[capacity + 1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void insert(Key key){
        pq[++N] = key;
        swim(N);
    }

    public Key delMax(){
        Key max = pq[1];
        exch(1, N--);
        pq[N + 1] = null;
        sink(1);
        return max;
    }


    private void swim(int k){
        while(k/2 > 0){
            int j = k/2; // parent element
            if (!less(j, k)) break;
            exch(j, k);
            k = k/2;
        }
    }

    private void sink(int k){
        //k = parent
        while(2 * k <= N){
            int j = k * 2; //one of two children
            if (j < N && less(j, j+1)) j++;
            if(!less(k, j)) break;
            exch(k, j);
            k = j;
        }

    }


    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) > 0;
    }

    private void exch(int i, int j){
        Key tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;
    }
}
