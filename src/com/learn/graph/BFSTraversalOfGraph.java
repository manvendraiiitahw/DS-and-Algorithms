package com.learn.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSTraversalOfGraph {
  public static void main(String[] args) {
    BFSTraversalOfGraph bfsTraversalOfGraph = new BFSTraversalOfGraph();
    int V = 5;
    Graph graph = new Graph(V);
    bfsTraversalOfGraph.addEdge(graph, 0, 1);
    bfsTraversalOfGraph.addEdge(graph, 0, 4);
    bfsTraversalOfGraph.addEdge(graph, 1, 2);
    bfsTraversalOfGraph.addEdge(graph, 1, 3);
    bfsTraversalOfGraph.addEdge(graph, 1, 4);
    bfsTraversalOfGraph.addEdge(graph, 2, 3);
    bfsTraversalOfGraph.addEdge(graph, 3, 4);
    bfsTraversalOfGraph.bfsTraversal(graph, 0);
  }

  private void addEdge(Graph graph, int src, int dest) {
    graph.adjListArray[src].add(dest);
//    graph.adjListArray[dest].add(src);
  }

  private void bfsTraversal(Graph graph, Integer src) {
    Set<Integer> integers = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(src);
    while (!queue.isEmpty()) {
      int curV = queue.poll();
      System.out.println(curV);
      integers.add(curV);
     for(Integer integer:graph.adjListArray[curV]){
       if(!integers.contains(integer)){
         integers.add(integer);
         ((LinkedList<Integer>) queue).add(integer);
       }
     }
    }
  }

}
