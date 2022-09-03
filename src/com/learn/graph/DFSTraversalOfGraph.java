package com.learn.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class DFSTraversalOfGraph {
  public static void main(String[] args) {
    DFSTraversalOfGraph dfsTraversalOfGraph = new DFSTraversalOfGraph();
    int V = 5;
    Graph graph = new Graph(V);
    dfsTraversalOfGraph.addEdge(graph, 0, 1);
    dfsTraversalOfGraph.addEdge(graph, 0, 4);
    dfsTraversalOfGraph.addEdge(graph, 1, 2);
    dfsTraversalOfGraph.addEdge(graph, 1, 3);
    dfsTraversalOfGraph.addEdge(graph, 1, 4);
    dfsTraversalOfGraph.addEdge(graph, 2, 3);
    dfsTraversalOfGraph.addEdge(graph, 3, 4);
    dfsTraversalOfGraph.bfsTraversal(graph, 0);
  }

  private void addEdge(Graph graph, int src, int dest) {
    graph.adjListArray[src].add(dest);
  }

  private void bfsTraversal(Graph graph, Integer src) {
    Set<Integer> integers = new HashSet<>();
    Stack<Integer> stack = new Stack<>();
    stack.push(src);
    while (!stack.isEmpty()) {
      int curV = stack.pop();
      System.out.println(curV);
      integers.add(curV);
     for(Integer integer:graph.adjListArray[curV]){
       if(!integers.contains(integer)){
         integers.add(integer);
         stack.push(integer);
       }
     }
    }
  }

}
