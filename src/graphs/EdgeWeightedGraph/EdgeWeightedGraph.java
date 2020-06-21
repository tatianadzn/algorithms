package graphs.EdgeWeightedGraph;

public class EdgeWeightedGraph {
    private final int V;
    private Node[] adj;

    public class Node{
        Edge edge;
        Node next;
        int length = 0;
    }

    public EdgeWeightedGraph(int V){
        this.V = V;
        adj = new Node[V];
        for (int i = 0; i < V; i++){
            Node n = new Node();
            n.length = 0;
            n.next = null;
            adj[i] = n;
        }
    }

    public void addEdge(Edge e){

        int v = e.either();
        int w = e.other(v);

        insertIntoAdj(e, v);
        insertIntoAdj(e, w);

    }

    private void insertIntoAdj(Edge e, int v){
        Node node = new Node();
        node.edge = e;
        node.next  = null;
        Node previous = adj[v];
        while (previous.next != null){
            previous  =  previous.next;
        }
        previous.next = node;
        adj[v].length++;
    }

    public Edge[] adj(int v){
        int len = adj[v].length;
        Edge[] edges = new Edge[len];
        Node current = adj[v];

        int i = 0;
        while (current.next != null){
            edges[i] = current.next.edge;
            current = current.next;
            i++;
        }
        return edges;
    }

    public int V(){
        return V;
    }
}
