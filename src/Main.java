import graphs.EdgeWeightedGraph.Edge;
import graphs.EdgeWeightedGraph.EdgeWeightedGraph;
import graphs.MinimumSpanningTrees.MSTKruskal;

public class Main {
    //testing client
    public static void main(String[] args) {

        EdgeWeightedGraph edg = new EdgeWeightedGraph(7);
        Edge e0 = new Edge(0, 1, 1);
        Edge e1 = new Edge(1, 2, 2);
        Edge e2 = new Edge(2, 5, 10);
        Edge e3 = new Edge(2, 3, 4);
        Edge e4 = new Edge(3, 5, 12);
        Edge e5 = new Edge(3, 4, 8);
        Edge e6 = new Edge(5, 4, 9);
        Edge e7 = new Edge(6, 4, 3);

        Edge e8 = new Edge(3, 1, 5);
        Edge e9 = new Edge(5, 1, 0);


        edg.addEdge(e0);
        edg.addEdge(e1);
        edg.addEdge(e2);
        edg.addEdge(e3);
        edg.addEdge(e4);
        edg.addEdge(e5);
        edg.addEdge(e6);
        edg.addEdge(e7);
        edg.addEdge(e8);
        edg.addEdge(e9);

//        for (Edge e : edg.adj(3)){
//            System.out.print(e.either());
//            System.out.print(" - ");
//            System.out.print(e.other(e.either()));
//            System.out.print(" : ");
//            System.out.println(e.weight());
//        }

        MSTKruskal mst = new MSTKruskal(edg);
        for (Edge e : mst.MST()){
            System.out.print(e.either());
            System.out.print(" - ");
            System.out.print(e.other(e.either()));
            System.out.print(" : ");
            System.out.println(e.weight());
        }

//
//        int vertex = 1;
//
//        for (Edge edge: edg.adj(vertex)){
//            System.out.println(edge.other(vertex));
//        }
//        graphs.UnionFind uf = new graphs.UnionFind(10);
//        uf.union(5, 6);
//        uf.union(1, 2);
//        uf.union(3, 4);
//        uf.union(8,9);
//        uf.union(4, 9);
//        uf.union(5, 9);
//        System.out.println(uf.find(3, 6));
//        System.out.println(uf.find(4, 6));
//        System.out.println(uf.find(1, 8));


    }
}
