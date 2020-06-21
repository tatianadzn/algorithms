package graphs;

public class UnionFind {
    private int[] id;
    private int[] size;

    public UnionFind(int capacity){
        id = new int[capacity];
        size = new int[capacity];
        for (int i = 0; i < capacity; i++){
            id[i] = i;
            size[i] = 0;
        }
    }

    public void union(int v, int w){
        int prev = root(v);
        int prew = root(w);
        if (prev != prew){
            if (size[prev] > size[prew]){
                id[prew] = id[prev];
                size[prev] += size[prew];
            }
            else{
                id[prev] = id[prew];
                size[prew] += size[prev];
            }
        }
    }

    public boolean find(int v, int w){
        return root(v) == root(w);
    }

    private int root(int i){
        while (i != id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
