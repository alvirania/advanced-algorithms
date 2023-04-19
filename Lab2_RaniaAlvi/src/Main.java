/**
 *
 * @author Rania
 * 500814930
 * 
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Problem 1
        System.out.print("What is the size of your matrix? ");
        int size = input.nextInt();
        Matrix chess = new Matrix(size);
        
        //Problem 2
        System.out.print("Enter the number of vertices and edges, separated by a space: ");
        int n = input.nextInt();
        int e = input.nextInt();
        
        Graph g = new Graph(n);
        
        System.out.println("Enter the vertices connected by an edge, separated by a space:");
        for (int i = 1; i <= e; i++){
            int v1 = input.nextInt();
            int v2 = input.nextInt();
            g.addEdge(v1, v2);
        }
        
        if (g.isCyclic()) {
            System.out.println("NO / Graph contains a cycle.");
        }
        else 
            System.out.println("YES / Graph does not contain a cycle.");

        //Problem 3
        
    }   
    
}
