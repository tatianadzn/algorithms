import graphs.Graph;

public class Main {
    //testing client
    public static void main(String[] args){

        int[][] adj = new int[3][2];
        adj[0][0] = 0;
        adj[0][1] = 2;
        adj[1][0] = 0;
        adj[1][1] = 1;
        adj[2][0] = 1;
        adj[2][1] = 3;

        Graph g = new Graph(4, 3, adj);
        for (int w : g.adj(1)){
            System.out.println(w);
        }
        g.show();
        System.out.println(g.E);
    }
}
