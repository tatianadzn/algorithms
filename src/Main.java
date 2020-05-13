import queues.*;

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
        ResizingArrayQueue<String> q = new ResizingArrayQueue<>();
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
