package graphs;

import stacks.LinkedStack;

public class DepthFirstPaths {
    private boolean[] marked;
    private LinkedStack<Integer> stack;

    public DepthFirstPaths(Graph g, int s){
        marked = new boolean[g.V];
        for (boolean b : marked){
            b = false;
        }
        stack = new <Integer>LinkedStack();

        while(true){
            marked[s] = true;
            for (int v : g.adj(s)){
                if (!marked[v]){
                    stack.push(v);
                }
            }
            if(!stack.isEmpty()) {
                s = stack.pop();
            } else {
                break;
            }
        }
    }


    public boolean isConnected(int v){
        return marked[v];
    }
}
