package queues.priorityQueues;

//linked list ordered implementation
public class MinPriorityQueueLinkedListImplementation<Key extends Comparable<Key>> {

    private int n;
    private Node first;

    private class Node{
        Key key;
        Node next;
    }

    public MinPriorityQueueLinkedListImplementation(){
        n = 0;
        first = null;
    }

    public MinPriorityQueueLinkedListImplementation(Key[] a){
        MinPriorityQueueLinkedListImplementation<Key> pq = new MinPriorityQueueLinkedListImplementation<>();
        for (int i = 0; i < a.length; i++){
            this.insert(a[i]);
        }
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void insert(Key key){
        Node newnode = new Node();
        newnode.key = key;
        if (isEmpty()) {
            newnode.next = null;
            first = newnode;
        } else if(first.key.compareTo(key) > 0) {
            newnode.next = first;
            first = newnode;
        } else {
                Node node = first;

                while(true){
                    Node nextnode = node.next;
                    if (nextnode == null){
                        //node is the last node
                        node.next = newnode;
                        newnode.next = null;
                        break;
                    }
                    if(nextnode.key.compareTo(key) > 0){
                        newnode.next = nextnode;
                        node.next = newnode;
                        break;
                    }

                    node = node.next;
                }
            }
        n++;
    }

    public Key delMin(){
        if (isEmpty()) return null; //underflow
        Key key = first.key;
        first = first.next;
        n--;
        return key;
    }

    public Key min(){
        if (isEmpty()) return null;
        return first.key;
    }

    public int size(){
        return n;
    }
}
