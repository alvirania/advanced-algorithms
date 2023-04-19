/**
 *
 * @author Rania
 * 500814930
 * 
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
  private int numVertices;
  private LinkedList<Integer> adjLists[];
  
  // Graph creation
  public Graph(int vertices) {
    numVertices = vertices;
    adjLists = new LinkedList[vertices];
    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<>();
  }
  
  void addEdge(int a, int b) {
    adjLists[a].add(b);
    adjLists[b].add(a);
  }
  
  //checks if cycle is present from the current visisted node and parent
  boolean checkCycle(int v, Boolean visited[], int parent) {
    visited[v] = true;
    Integer i;
    
    Iterator<Integer> it = adjLists[v].iterator();
    while (it.hasNext()) {
        i = it.next();
        
        if (!visited[i]) {
            if (checkCycle(i, visited, v)) {
                return true;
            }
        }
        else if (i != parent) {
            return true;
        }
    }
    return false;
  }
  
  boolean isCyclic() {
      Boolean visited[] = new Boolean[numVertices];
      for (int i = 0; i < numVertices; i++)
          visited[i] = false;
      
      for (int u = 0; u < numVertices; u++) {
          if (!visited[u]) {
              if (checkCycle(u, visited, -1)) {
                  return true;
              }
          }
      }
      return false;
  }
  
}
