package advance.java;

import java.util.*;

public class Result1 {
    private final int V;
    private final List<List<Integer>> adj;

    public Result1(int V)
    {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }
    private void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    public static boolean check_hie(int n, List<List<Integer>> arr) {
        Result1 g = new Result1(n);
        for (int i = 0; i < n; i++) {
            List<Integer> l1=arr.get(i);
            g.addEdge(l1.get(0), l1.get(1));
        }
        return !g.isCyclic();
    }

    private boolean isCyclicUtil(int i, boolean[] visited,
                                 boolean[] recStack)
    {
        if (recStack[i])
            return true;
        if (visited[i])
            return false;
        visited[i] = true;
        recStack[i] = true;
        List<Integer> children = adj.get(i);
        for (Integer c: children)
            if (isCyclicUtil(c, visited, recStack))
                return true;
        recStack[i] = false;
        return false;
    }
    private boolean isCyclic()
    {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];
        for (int i = 0; i < V; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;
        return false;
    }

    public static void main(String[] args) {
        long l[]=new long[4];
        Arrays.fill(l,-1l);
        test("ss",0,l);
    }
    public static int test(String s, int i, long l[]){

        return (int) abs();
    }
    public static long abs(){
        return 1l;
    }

}
