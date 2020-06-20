import graphs.BreadthFirstPaths;
import graphs.ConnectedComponents;
import graphs.EdgeWeightedGraph.Edge;
import graphs.EdgeWeightedGraph.EdgeWeightedGraph;
import graphs.Graph;

public class Main {
    //testing client
    public static void main(String[] args){

        int[][] adj = new int[2][2];
        adj[0][0] = 2;
        adj[0][1] = 0;
        adj[1][0] = 4;
        adj[1][1] = 1;

        EdgeWeightedGraph edg = new EdgeWeightedGraph(7);
        Edge e = new Edge(6, 0, 0.58);
        Edge e_ = new Edge(0, 2, 0.26);

        edg.addEdge(e);
        edg.addEdge(e_);

        int vertex = 1;

        for (Edge edge: edg.adj(vertex)){
            System.out.println(edge.other(vertex));
        }
    }
}
