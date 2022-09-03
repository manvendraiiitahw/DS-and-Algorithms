package coding.dcp.ms;

import java.util.Iterator;
import java.util.Stack;

public class DFS {
    static void dfs(Graph g, int s, int v) {
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();
        visited[s] = true;
        st.push(s);
        while (!st.isEmpty()) {
            s = st.pop();
            Iterator<Integer> itr = g.adjacencyList[s].iterator();
            while (itr.hasNext()) {
                int newNode = itr.next();
                if (!visited[newNode]) {
                    visited[newNode]=true;
                    st.push(newNode);
                }
            }
            System.out.println(s);
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
        dfs(g, 0, 4);
    }
}
