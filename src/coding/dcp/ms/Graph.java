package coding.dcp.ms;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    int v;
    LinkedList<Integer>[] adjacencyList;

    public Graph(int v) {
        this.v = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adjacencyList[i] = new LinkedList<>();
    }
    void addEdge(int v,int w)
    {
        adjacencyList[v].add(w);
    }
}
