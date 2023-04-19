/**
 *
 * @author Rania
 * 500814930
 * 
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
  private int numVertices;
  private LinkedList<Integer> adjLists[];
  //private boolean visited[];
  
  // Graph creation
  public Graph(int vertices) {
    numVertices = vertices;
    adjLists = new LinkedList[vertices];
    //visited = new boolean[vertices];
    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<>();
  }
 
  // Add edges
  void addEdge(int a, int b) {
    adjLists[a].add(b);
  }

  // DFS algorithm
  void DFS(int vertex, Boolean visited[]) {
    visited[vertex] = true;
    int node;

    Iterator<Integer> DFSit = adjLists[vertex].listIterator();
    while (DFSit.hasNext()) {
      node = DFSit.next();
      if (!visited[node])
        DFS(node, visited);
    }
  }
  
  Graph Transpose() {
      Graph g = new Graph(numVertices);
      for (int i = 0; i<numVertices; i++) {
          Iterator<Integer> tr = adjLists[i].listIterator();
          while (tr.hasNext()) {
              g.adjLists[tr.next()].add(i);
          }
      }
      return g;
  }
  
  public boolean isStronglyConnected (){
      Boolean visited[] = new Boolean[numVertices];
      //all vertices are marked false
      for (int i = 0; i < numVertices; i++){
          visited[i] = false; 
      }
      
      //DFS through the graph
      DFS(0, visited);
      
      //true if all vertices are visited
      for (int i = 0; i<numVertices; i++) {
          if (visited[i] == false){
              return false;
          }
      }
      return true;
  }
  
}