/**
 *
 * @author Rania
 */
package lab5p2;
import java.util.List;
import java.util.Scanner;
import static lab5p2.RabinKarpLasVegas.rabinKarp;

public class Lab5p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Enter the text: ");
        String input = sc.nextLine();
        System.out.println("Enter the pattern: ");
        String pattern = sc.nextLine();
            
        //Rabin-Karp
        System.out.println("------RABIN-KARP ALGORITHM------");
            
        List<Integer> index = rabinKarp(input, pattern);
        if (index.size() == 0) {
            System.out.println("Pattern not found in the text");
        } 
        else {
            System.out.println("Pattern " + pattern + " found in the text at index: " + index);
        }
    }
    
}
