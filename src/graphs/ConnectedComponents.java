package graphs;

import stacks.LinkedStack;

public class ConnectedComponents {
    private int numberOfComponents;
    private boolean[] marked;
    private int[] component;
    private LinkedStack<Integer> stack;

    public ConnectedComponents(Graph g){
        numberOfComponents = -1;

        marked = new boolean[g.V];
        for (int i = 0; i < marked.length; i++){
            marked[i] = false;
        }
        component = new int[g.V];

        stack = new <Integer>LinkedStack();


        for (int i = 0; i < g.V; i++){
            if (!marked[i]){
                numberOfComponents++;
                stack.push(i);
                while (!stack.isEmpty()){
                    int s = stack.pop();
                    component[s] = numberOfComponents;
                    marked[s] = true;

                    for(int w : g.adj(s)){
                        if(!marked[w]){
                            stack.push(w);
                        }
                    }
                }
            }
        }
    }

    public boolean isSameComponent(int v, int w){
        return component[v] == component[w];
    }

    public int numberOfComponents(){
        return numberOfComponents + 1;
    }
}
