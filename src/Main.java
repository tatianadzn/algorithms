import sorting.Merge;
import sorting.MergeBottomUp;

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

        Integer[] a = new Integer[5];
        a[0] = 1;
        a[1] = 6;
        a[2] = 3;
        a[3] = 0;
        a[4] = 5;

        MergeBottomUp.sort(a);

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
