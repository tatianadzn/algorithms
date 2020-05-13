import stacks.*;

public class Main {
    //test client
    public static void main(String[] args){
//        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        FixedCapacityStackOfStringsArrayImplementation stack = new FixedCapacityStackOfStringsArrayImplementation(4);
        System.out.println(stack.isEmpty());
        stack.push("to");
        stack.push("be");
        stack.push("or");
        System.out.println(stack.pop());
        stack.push("not");
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
