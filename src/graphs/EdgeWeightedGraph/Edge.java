package graphs.EdgeWeightedGraph;

public class Edge implements Comparable<Edge> {
    private final int v, w;
    private final double weight;

    public Edge(int v, int w, double weight){
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either(){
        return this.v;
    }

    public int other (int v){
        if (this.v == v) return this.w;
        else return this.v;
    }

    public double weight(){
        return this.weight;
    }

    @Override
    public int compareTo(Edge that) {
        if (this.weight > that.weight)          return -1;
        if (this.weight < that.weight)          return +1;
        else                                    return 0;
    }
}
