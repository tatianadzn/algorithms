package graphs;

import queues.LinkedListQueue;


public class BreadthFirstPaths {
    private double[] dist;
    private String[] color;
    private LinkedListQueue<Integer> queue;

    public BreadthFirstPaths(Graph g, int s){

        dist = new double[g.V];
        for (int i = 0; i < dist.length; i++){
            dist[i] = Double.POSITIVE_INFINITY;
        }
        color = new String[g.V];
        for (int i = 0; i < color.length; i++){
            color[i] = "WHITE";
        }

        queue = new <Integer>LinkedListQueue();

        queue.enqueue(s);
        dist[s] = 0;
        while(!queue.isEmpty()){
            s = queue.dequeue();
            color[s] = "BLACK";
            for (int v : g.adj(s)){
                if (color[v].equals("WHITE")){
                    queue.enqueue(v);
                    dist[v] = dist[s] + 1;
                    color[v] = "GREY";
                }
            }
        }
    }


    public boolean isConnected(int v){
        return color[v].equals("BLACK");
    }

    public double shortestPath(int v){
        return dist[v];
    }
}
