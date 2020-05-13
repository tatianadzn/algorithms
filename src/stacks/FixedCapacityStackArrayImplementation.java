package stacks;

public class FixedCapacityStackArrayImplementation <Item> {
    private Item[] s;
    private int N = 0;
    public FixedCapacityStackArrayImplementation(int capacity){
        s = (Item[]) new Object[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(Item item){
        s[N++] = item;
    }

    public Item pop(){
        //avoiding loitering
        Item item = s[--N];
        s[N] = null;
        return item;
    }

}
