package graphs;

public class Graph {
    private class Node{
        int key;
        Node next;
        int length = 0;
    }
    public int E;
    public int V;

    private Node[] adj;

    public Graph(int _V, int _E, int[][] edges){
        V = _V;
        E = _E;
        adj = new Node[V];
        for (int i = 0; i < V; i++){
            Node node = new Node();
            node.key = i;
            node.next = null;
            adj[i] = node;
        }

        for (int i = 0; i < E; i++){
            int v = edges[i][0];
            int w = edges[i][1];
            insert(v, w);
            insert(w, v);
        }
    }

    public Integer[] adj(int v){
        Node n = adj[v];
        int len = n.length;
        Integer[] vertices = new Integer[len];
        for(int i = 0; i < len; i++){
            vertices[i] = n.next.key;
            n = n.next;
        }
        return vertices;
    }

    public void show(){
        for (Node p: adj
             ) {
            int key = p.key;
            while(p.next != null){
                System.out.print(key);
                System.out.print(" - ");
                System.out.println(p.next.key);
                p = p.next;
            }
        }
    }

    private void insert(int i, int v){
        Node n = adj[i];
        n.length++;
        while(n.next != null){
            n = n.next;
        }
        Node node = new Node();
        node.key = v;
        node.next = null;
        n.next = node;
    }
}
