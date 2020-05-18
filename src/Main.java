import queues.priorityQueues.MaxPriorityQueueBinaryHeapImplementation;
import queues.priorityQueues.MinPriorityQueueLinkedListImplementation;
import sorting.Heapsort;
import sorting.Insertion;

public class Main {
    //testing client
    public static void main(String[] args){
//        LinkedStack stack = new LinkedStack();
//        FixedCapacityStackArrayImplementation stack = new FixedCapacityStackArrayImplementation(4);
//        ResizingArrayStack stack = new ResizingArrayStack();
//        System.out.println(stack.isEmpty());
//        stack.push("to");
//        stack.push("be");
//        stack.push("or");
//        System.out.println(stack.pop());
//        stack.push("not");
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());

//        LinkedListQueue q = new LinkedListQueue();
//        ResizingArrayQueue<String> q = new ResizingArrayQueue<>();
//        QueueByTwoStacks<String> q = new QueueByTwoStacks<>();
//        System.out.println(q.isEmpty());
//        q.enqueue("to");
//        q.enqueue("be");
//        q.enqueue("or");
//        System.out.println(q.dequeue());
//        q.enqueue("not");
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.isEmpty());

        Integer[] a = new Integer[8];
        a[0] = 1;
        a[1] = 6;
        a[2] = 3;
        a[3] = 0;
        a[4] = 2;
        a[5] = 2;
        a[6] = 3;
        a[7] = 8;

        Insertion.sort(a);
//        Heapsort.sort(a);

        Heapsort.show(a);
//
//        QuicksortWithDijkstra3WayPartitioning.sort(a);
//
//        Quicksort.show(a);

//        MinPriorityQueueLinkedListImplementation<Integer> pq = new MinPriorityQueueLinkedListImplementation<>(a);

//        MinPriorityQueueLinkedListImplementation<Integer> pq = new MinPriorityQueueLinkedListImplementation<>();
//        pq.insert(3);
//        pq.insert(1);
//        pq.insert(2);
//        pq.insert(6);
//        pq.insert(0);
//        pq.insert(4);

//        MaxPriorityQueueBinaryHeapImplementation<Integer> pq = new MaxPriorityQueueBinaryHeapImplementation<>(6);
//        pq.insert(3);
//        pq.insert(1);
//        pq.insert(2);
//        pq.insert(6);
//        pq.insert(0);
//        pq.insert(4);
//        System.out.println(pq.delMax());
//        System.out.println(pq.delMax());
//        System.out.println(pq.delMax());
//        System.out.println(pq.delMax());
//        System.out.println(pq.delMax());
//        System.out.println(pq.delMax());


    }
}
