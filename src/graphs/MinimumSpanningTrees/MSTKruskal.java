package graphs.MinimumSpanningTrees;

import graphs.EdgeWeightedGraph.Edge;
import graphs.EdgeWeightedGraph.EdgeWeightedGraph;
import graphs.UnionFind;
import queues.priorityQueues.MinPriorityQueueLinkedListImplementation;

import java.util.LinkedList;


public class MSTKruskal {
    private int V;
    private int E;
    private MinPriorityQueueLinkedListImplementation<Edge> pq;
    private LinkedList<Edge> mst;
    private UnionFind uf;

    public MSTKruskal(EdgeWeightedGraph g){
        V = g.V();
        E = 0;
        uf = new UnionFind(V);
        mst = new LinkedList<>();
        pq = new MinPriorityQueueLinkedListImplementation<>();
        for (int i = 0; i < V; i++){
            for(Edge e : g.adj(i)){
                pq.insert(e);
            }
        }
    }
    public LinkedList<Edge> MST(){
        while (!pq.isEmpty() || E != V - 1){
            Edge e = pq.delMin();
            int v = e.either();
            int w = e.other(v);
            if (!uf.find(v, w)){
                uf.union(v, w);
                mst.add(e);
                E++;
            }
        }

        return mst;
    }

}
