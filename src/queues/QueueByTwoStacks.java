package queues;

import stacks.ResizingArrayStack;

public class QueueByTwoStacks <Item>{
    private ResizingArrayStack<Item> stack1, stack2;
    private int n;

    public QueueByTwoStacks(){
        stack1 = new ResizingArrayStack<>();
        stack2 = new ResizingArrayStack<>();
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public void enqueue(Item item){
        if (stack1.isEmpty()){
            if(stack2.isEmpty()){
                stack1.push(item);
            } else {
                popping_s1_to_s2(stack2, stack1, n);
                stack1.push(item);
            }
        } else {
            stack1.push(item);
        }
        n++;
    }

    public Item dequeue(){
        Item item = null;
        if (stack2.isEmpty()){
            if(stack1.isEmpty()){
                //throw exception
            } else {
                popping_s1_to_s2(stack1, stack2, n);
                item = stack2.pop();
                n--;
            }
        } else{
            item = stack2.pop();
        }
        return item;
    }

    private void popping_s1_to_s2(ResizingArrayStack<Item> s1, ResizingArrayStack<Item> s2, int n){
        for (int i = 0; i < n; i++){
            s2.push(s1.pop());
        }
    }
}
