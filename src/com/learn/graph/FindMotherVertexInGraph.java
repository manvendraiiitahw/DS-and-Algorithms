package com.learn.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//A mother vertex in a graph G = (V,E) is a vertex v such that all other vertices in G can be reached by a path from v.
public class FindMotherVertexInGraph {
  public static void main(String[] args) {
    FindMotherVertexInGraph findMotherVertexInGraph = new FindMotherVertexInGraph();
    int V = 7;
    Graph graph = new Graph(V);
    findMotherVertexInGraph.addEdge(graph, 0, 1);
    findMotherVertexInGraph.addEdge(graph, 0, 2);
    findMotherVertexInGraph.addEdge(graph, 1, 3);
    findMotherVertexInGraph.addEdge(graph, 4, 1);
    findMotherVertexInGraph.addEdge(graph, 5, 2);
    findMotherVertexInGraph.addEdge(graph, 5, 6);
    findMotherVertexInGraph.addEdge(graph, 6, 0);
    findMotherVertexInGraph.addEdge(graph, 6, 4);
    int[] motherVertexList = new int[7];
    for (int i = 0; i < V; i++) {
      motherVertexList = findMotherVertexInGraph.findMotherVertex(graph, i, motherVertexList);
      if (motherVertexList[V - 1] != 0 || motherVertexList[V - 2] != 0) {
        System.out.println("Mother vertex is:" + 5);
        for (Integer integer : motherVertexList) {
          System.out.println(integer + " ");
        }
        break;
      }

    }
  }

  private void addEdge(Graph graph, int src, int dest) {
    graph.adjListArray[src].add(dest);
  }

  private int[] findMotherVertex(Graph graph, Integer src, int[] motherVertexList) {
    Set<Integer> integers = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    stack.push(src);
    int index = 0;
    while (!stack.isEmpty()) {
      int curV = stack.pop();
      motherVertexList[index] = curV;
      index++;
      integers.add(curV);
      for (Integer integer : graph.adjListArray[curV]) {
        if (!integers.contains(integer)) {
          integers.add(integer);
          stack.push(integer);
        }
      }
    }
    return motherVertexList;
  }

}
