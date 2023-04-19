/**
 *
 * @author Rania
 * 500814930
 * 
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner gr = new Scanner(System.in);
        
        System.out.print("Enter the number of vertices and edges, separated by a space: ");
        int n = gr.nextInt();
        int e = gr.nextInt();
        
        Graph g = new Graph(n);
        
        System.out.println("Enter the vertices connected by an edge, separated by a space:");
        for (int i = 1; i <= e; i++){
            int v1 = gr.nextInt();
            int v2 = gr.nextInt();
            g.addEdge(v1, v2);
        }
        
        System.out.println("");
        for (int i = 0; i < n; i++){
            System.out.println("Vertex: " + i);
            System.out.print("\tdegree = ");
            g.degreeVertex(i);
            System.out.print("\tadjacent vertices = ");
            g.printAdjVertices(i);
            System.out.print("\n");
        }        
        
        System.out.print("Depth First Traversal: ");
        g.DFS(0);
        
        System.out.print("\n\nBreadth First Traversal: ");
        g.BFS(0);
        
    }
    
}
