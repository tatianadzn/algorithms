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
        Node node = new Node();
        node.edge = e;
        node.next  = null;
        int v = e.either();
        int w = e.other(v);

        insertIntoAdj(node, v);
        insertIntoAdj(node, w);

    }

    private void insertIntoAdj(Node node, int v){
        Node previous = adj[v];
        for (int i = 0; i < adj[v].length; i++){
            previous  =  previous.next;
        }
        previous.next = node;
        adj[v].length++;
    }

    public Edge[] adj(int v){
        int len = adj[v].length;
        Edge[] edges = new Edge[len];
        Node current = adj[v];

        for (int i = 0;  i < len; i++){
            edges[i] = current.next.edge;
            current = current.next;
        }
        return edges;
    }
}
