
public class Main {
    //testing client
    public static void main(String[] args){

        BinarySearchTree bst = new BinarySearchTree();
        bst.Insert(6);
        bst.Insert(7);
        bst.Insert(1);
        bst.Insert(5);
        bst.Insert(10);
        bst.Insert(2);
        bst.Insert(6);
        bst.Insert(4);
        System.out.println(bst.Predecessor(10));
    }
}
