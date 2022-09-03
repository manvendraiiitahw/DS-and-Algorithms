package com.learn.graph;

public class AdjacencyListBasedGraphRepresentation {
  public static void main(String[] args) {
    AdjacencyListBasedGraphRepresentation graphRepresentation = new AdjacencyListBasedGraphRepresentation();
    int V = 5;
    Graph graph = new Graph(V);
    graphRepresentation.addEdge(graph, 0, 1);
    graphRepresentation.addEdge(graph, 0, 4);
    graphRepresentation.addEdge(graph, 1, 2);
    graphRepresentation.addEdge(graph, 1, 3);
    graphRepresentation.addEdge(graph, 1, 4);
    graphRepresentation.addEdge(graph, 2, 3);
    graphRepresentation.addEdge(graph, 3, 4);
    graphRepresentation.printGraph(graph);

  }

  private void addEdge(Graph graph, int src, int dest) {
    graph.adjListArray[src].add(dest);
    graph.adjListArray[dest].add(src);
  }

  private void printGraph(Graph graph) {
    for (int i = 0; i < graph.V; i++) {

      System.out.println("Adjacency list of vertex " + i);
      System.out.print("head: ");
      for (Integer integer : graph.adjListArray[i]) {
        System.out.print(integer+" ");
      }
      System.out.println();
    }
  }


}
