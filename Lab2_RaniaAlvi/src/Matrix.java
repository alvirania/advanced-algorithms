/**
 *
 * @author Rania Alvi
 * 500814930
 * 
 */

public class Matrix {
   private int n;
   final int [][] nQueen;
   
   public Matrix(int n) {
       this.n = n;
       nQueen  = new int [n][n];
       
       for (int i=0; i<n; i++) {
           for (int j=0; j<n; j++){
               if (i == j){
                   nQueen[i][j] = 1;
               }
               else {
                   nQueen[i][j] = 0;
               }
               System.out.print(nQueen[i][j] + "\t");
           }
           System.out.println();
       }
     }        
            
}
