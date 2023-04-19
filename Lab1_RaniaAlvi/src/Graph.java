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
  private boolean visited[];
  private boolean visited1[];
  
  // Graph creation
  public Graph(int vertices) {
    numVertices = vertices;
    adjLists = new LinkedList[vertices];//creates linkedlist with x vertices
    visited = new boolean[vertices];//creates an array with of x vertices
    visited1 = new boolean[vertices];//this is for BFS so there's no 

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<>();//creates an adjacency list for each vertex
  }
  
  /**
   * /void since there is no return value
   * /not using static because the method 
   * needs to be initialized: new Graph(v)
   * static void would mean i don't need
   * to initialize this class
   */
  // Add edges
  void addEdge(int a, int b) {
    adjLists[a].add(b);
    adjLists[b].add(a);
  }
  
  /**Degree of a vertex
   * Iterator will allow to loop through
   * adjacency list
   * hasNext will return true if there
   * is a value after
   */
  public int degreeVertex(int a) {
      System.out.println(adjLists[a].size());
      return 0;
  }
  
   /**
   * next() will return the value after
   * the node vertex
   */ 
  int printAdjVertices(int a) {
      System.out.println(adjLists[a]);
      return 0;
  }

  // DFS algorithm
  void DFS(int vertex1) {
    visited[vertex1] = true;
    System.out.print(vertex1 + " ");

    Iterator<Integer> DFSiterate = adjLists[vertex1].listIterator();
    while (DFSiterate.hasNext()) {
      int adj = DFSiterate.next();
      if (!visited[adj])
        DFS(adj);
    }
  }
  
  
  // BFS algorithm
  void BFS(int vertex) {
    visited1[vertex] = true;
    Queue<Integer> queue = new LinkedList<>();
    queue.add(vertex);
    
    while (!queue.isEmpty()) {
        int node = queue.poll();//set to the first value that is removed from queue
        System.out.print(node + " ");
        
        for (int i : adjLists[node]){
          if (!visited1[i]){
              visited1[i] = true;
              queue.add(i);
          }
        }
    } 
  }

}