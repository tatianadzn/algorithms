package hashTabels;

public class HashTableWithChaining <Key, Value> {
    private int M;
    private Node[] st;

    public HashTableWithChaining(int capacity){
        M = capacity;
        st = new Node[M];
    }

    private static class Node{
        private Node prev;
        private Node next;
        private Object key;
        private Object value;
    }

    private int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void insert(Key key, Value value){
        int i = hash(key);
        //assume that there is no such key and we do not need to search for it
        Node oldnode = st[i];
        Node node = new Node();
        node.key = key;
        node.value = value;
        node.prev = null;
        node.next = oldnode;
        if (oldnode != null) oldnode.prev = node;
        st[i] = node;
    }

    public Object search(Key key){
        int i = hash(key);
        for (Node node = st[i]; node != null; node = node.next){
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }
}
