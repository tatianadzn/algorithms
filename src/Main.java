import stacks.*;
import queues.*;

public class Main {
    //testing client
    public static void main(String[] args){
//        LinkedStackOfStrings stack = new LinkedStackOfStrings();
//        FixedCapacityStackOfStringsArrayImplementation stack = new FixedCapacityStackOfStringsArrayImplementation(4);
//        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
//        System.out.println(stack.isEmpty());
//        stack.push("to");
//        stack.push("be");
//        stack.push("or");
//        System.out.println(stack.pop());
//        stack.push("not");
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());

        LinkedListQueueOfStrings q = new LinkedListQueueOfStrings();
        System.out.println(q.isEmpty());
        q.enqueue("to");
        q.enqueue("be");
        q.enqueue("or");
        System.out.println(q.dequeue());
        q.enqueue("not");
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());

    }
}
