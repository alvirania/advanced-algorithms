/*
 * 
 * @author Rania
 * 500814930
 * 
 */
import java.util.Scanner;

public class Main {
    
    static int cutRod(int price[], int n){
        // base case
        int cost[] = new int[n+1];
        cost[0] = 0;
        
        for (int i =1; i<=n; i++) {
            int maxCost = Integer.MIN_VALUE;
            for (int j=0; j<i; j++){
                maxCost = Math.max(maxCost, price[j] + cost[i-j-1]);
            }
            cost[i] = maxCost;
        }
        return cost[n];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Problem 1
         System.out.println("What is the length of the rod? ");
        int length = sc.nextInt();
        int[] price = new int[length];

        System.out.println ("Enter the price of the lengths separated by a space:");
        for (int i=0; i<price.length; i++){
            price[i] = sc.nextInt();
        }

        System.out.println("MAXIMUM COST IS: " + cutRod(price, length));
    
        
        //Problem 2
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
        
        if (g.isStronglyConnected())
            System.out.println(" YES, GRAPH IS STRONGLY CONNECTED.");
        else
            System.out.println(" NO, GRAPH IS NOT STRONGLY CONNECTED.");
        
    }
    
}
