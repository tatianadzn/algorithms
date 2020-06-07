import graphs.BreadthFirstPaths;
import graphs.Graph;

public class Main {
    //testing client
    public static void main(String[] args){

        int[][] adj = new int[4][2];
        adj[0][0] = 0;
        adj[0][1] = 2;
        adj[1][0] = 0;
        adj[1][1] = 1;
        adj[2][0] = 1;
        adj[2][1] = 3;
        adj[3][0] = 2;
        adj[3][1] = 1;

        Graph g = new Graph(4, 4, adj);
        for (int w : g.adj(1)){
            System.out.println(w);
        }
//        DepthFirstPaths dfp = new DepthFirstPaths(g, 1);
//        System.out.println(dfp.isConnected(2));
        BreadthFirstPaths bfp = new BreadthFirstPaths(g, 0);
        System.out.println(bfp.shortestPath(1));
    }
}
