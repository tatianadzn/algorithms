package queues;

public class ResizingArrayQueue <Item> {
    private int last, first;
    private int n;
    private Item [] q;

    public ResizingArrayQueue(){
        q = (Item []) new Object[2];
        first = 0;
        last = 0;
        n = 0;
    }

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void enqueue(Item item){
        if (n == q.length){
            resize(q.length * 2);
        }
        q[last++] = item;
        n++;

        if (last == q.length) {
            last = 0; //wrap-around
        }
    }

    public Item dequeue(){
        Item item = q[first];
        q[first++] = null;
        n--;

        if (first == q.length) first = 0;

        if (n > 0 && n == q.length/4) resize(q.length/2);
        return item;
    }

    private void resize(int capacity){
        Item [] copy = (Item []) new Object[capacity];
        for (int i = 0; i < n; i++){
            copy[i] = q[(first + i) % q.length];
        }
        q = copy;
        first = 0;
        last = n;
    }
}