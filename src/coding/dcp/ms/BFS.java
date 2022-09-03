package coding.dcp.ms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static void bfs(Graph g, int s, int v) {
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.println(s);
            Iterator<Integer> itr = g.adjacencyList[s].iterator();
            while (itr.hasNext()) {
                int n = itr.next();
                if (!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        bfs(g, 0, 4);
    }
}
