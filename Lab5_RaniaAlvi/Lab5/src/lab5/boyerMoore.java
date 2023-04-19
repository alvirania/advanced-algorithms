package lab5;

/**
 *
 * @author Rania
 */
public class boyerMoore {
    static int numChar = 256;

    static void badCharHeuristic( char []str, int size,int badchar[]) {
      for (int i = 0; i < numChar; i++)
        badchar[i] = -1;
      for (int i = 0; i < size; i++)
        badchar[(int) str[i]] = i;
    }
 
    static void search( char txt[],  char pat[]) {
      int m = pat.length;
      int n = txt.length;
 
      int badchar[] = new int[numChar];
 
      badCharHeuristic(pat, m, badchar);
 
      int s = 0;  
      while(s <= (n - m)) {
        int j = m-1;
 
        while(j >= 0 && pat[j] == txt[s+j])
            j--;
          
        if (j < 0) {
            System.out.println("Pattern occurs at index " + s);
            s += (s+m < n)? m-badchar[txt[s+m]] : 1;
        }
        else
            s += Math.max(1, j - badchar[txt[s+j]]);
      }
     }
}
