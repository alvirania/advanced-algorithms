package lab5p2;

/**
 *
 * @author Rania
 */
import java.util.ArrayList;
import java.util.List;

public class RabinKarpLasVegas {
    
    public static List<Integer> rabinKarp(String text, String pattern) {
        List<Integer> indices = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        if (n < m) {
            return indices; 
        }

        int d = 256; // number of characters in the input alphabet
        int q = 101; // a prime number

        int p = 0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;

        //initial hash value of the pattern
        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        //calculate initial hash values for pattern and text to compare hash values
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        // check for match at each position in text
        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                //for no matching pattern
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i+j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    indices.add(i);
                }
            }
            // calculate hash value for next window of text
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;
                if (t < 0) {
                    t += q;
                }
            }
        }
        return indices;
    }

}
