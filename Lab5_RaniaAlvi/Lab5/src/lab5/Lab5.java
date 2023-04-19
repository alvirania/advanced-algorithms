/**
 *
 * @author Rania
 */
package lab5;
import java.util.Scanner;

public class Lab5 {

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

        //Boyer-Moore
        char txt[] = input.toCharArray();
        char pat[] = pattern.toCharArray();
        System.out.println("------BOYER-MOORE ALGORITHM------");
        boyerMoore.search(txt, pat);
    }
    
}
