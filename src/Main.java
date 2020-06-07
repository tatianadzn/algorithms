import graphs.BreadthFirstPaths;
import graphs.ConnectedComponents;
import graphs.Graph;

public class Main {
    //testing client
    public static void main(String[] args){

        int[][] adj = new int[2][2];
        adj[0][0] = 2;
        adj[0][1] = 0;
        adj[1][0] = 4;
        adj[1][1] = 1;

        Graph g = new Graph(5, 2, adj);
        for (int w : g.adj(3)){
            System.out.println(w);
        }
//        DepthFirstPaths dfp = new DepthFirstPaths(g, 1);
//        System.out.println(dfp.isConnected(2));
//        BreadthFirstPaths bfp = new BreadthFirstPaths(g, 0);
//        System.out.println(bfp.shortestPath(1));
        ConnectedComponents cp = new ConnectedComponents(g);
        System.out.println(cp.isSameComponent(0, 4));
        System.out.println(cp.numberOfComponents());
    }
}
