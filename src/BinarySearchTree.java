public class BinarySearchTree {
    private Node root;

    private class Node{
        Comparable key;
        Node left;
        Node right;
        Node parent;
    }

    public BinarySearchTree(){
        root = null;
    }

    public void InorderTreeWalk(){
        InorderTreeWalk(root);
    }

    private void InorderTreeWalk(Node x){
        if (x != null) {
            InorderTreeWalk(x.left);
            System.out.println(x.key);
            InorderTreeWalk(x.right);
        }
    }

    public Comparable Maximum(){
        return Maximum(root).key;
    }

    public Comparable Minimum(){
        return Minimum(root).key;
    }

    private Node Maximum(Node x){
        while (x.right != null){
            x = x.right;
        }
        return x;
    }

    private Node Minimum(Node x){
        while(x.left != null){
            x = x.left;
        }
        return x;
    }

    public Comparable search(Comparable key){
        Node s = search(root, key);
        if (s != null){
            return s.key;
        }
        else return null;
    }

    private Node search(Node x, Comparable key){
        if (x == null || x.key == key){
            return x;
        }
        if (less(key, x.key)) {
            return search(x.left, key);
        }
        else {
            return search(x.right, key);
        }
    }

    public Comparable Successor(Comparable key){
        Node s = search(root, key);
        if (s != null){
            s = Successor(s);
            if (s != null){
                return s.key;
            }
            return null;
        }
        return null;
    }

    private Node Successor(Node k){
        if (k.right !=  null){
            return Minimum(k.right);
        }
        while (k.parent != null && k.parent.right == k){
            k = k.parent;
        }
        return k.parent;
    }

    public Comparable Predecessor(Comparable key){
        Node s = search(root, key);
        if (s != null){
            s = Predecessor(s);
            if (s != null){
                return s.key;
            }
            return null;
        }
        return null;
    }

    private Node Predecessor(Node k){
        if (k.left != null){
            return Maximum(k.left);
        }
        while (k.parent != null && k.parent.left == k){
            k = k.parent;
        }
        return k.parent;
    }


    public void Insert(Comparable key){
        Node z = new Node();
        z.parent = null;
        z.left = null;
        z.right = null;
        z.key = key;
        Insert(z);
    }

    private void Insert(Node z){
        Node y = null;
        Node x = root;
        while (x != null){
            y = x;
            if (less(z.key, x.key)){
                x = x.left;
            }
            else x = x.right;
        }
        z.parent = y;
        if (y == null){ //tree was empty
            root = z;
        }
        else{
            if (less(z.key, y.key)){
                y.left = z;
            }
            else{
                y.right = z;
            }
        }
    }

    public void Delete(Comparable key){
        Node s = search(root, key);
        if (s != null){
            Delete(s);
        }
    }

    private void Delete(Node z){
        if (z.left == null){
            Transplant(z, z.right);
        }
        else if(z.right == null) {
            Transplant(z, z.left);
        }
        else {
            Node y = Minimum(z.right);
            if (y != z.right){
                Transplant(z.right, y);
                y.parent = z;
                z.right = y;
            }
            Transplant(z, y);
            z.left.parent = y;
            y.left = z.left;
        }
    }




    //helper functions
    private void Transplant(Node u, Node k){
        if (u.parent == null){
            root = k;
        }
        else{
            if (u.parent.left == u){
                u.parent.left = k;
            }
            else u.parent.right = k;
            k.parent = u.parent;
        }
    }

    private boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
}
