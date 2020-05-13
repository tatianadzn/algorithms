package stacks;

public class FixedCapacityStackOfStringsArrayImplementation {
    private String[] s;
    private int N = 0;
    public FixedCapacityStackOfStringsArrayImplementation(int capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(String item){
        s[N++] = item;
    }

    public String pop(){
        //avoiding loitering
        String item = s[--N];
        s[N] = null;
        return item;
    }

}
