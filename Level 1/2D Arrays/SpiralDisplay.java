import java.io.*;
import java.util.*;

public class SpiralDisplay {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int elements = n * m;
        int i = 0, j = 0, k = 0;
        while (elements > 0) {
            if (elements > 0) {
                for (int t = i; t < n; t++) {
                    System.out.println(mat[t][j]);
                    elements--;
                    i++;
                }
            }
            i--;
            j++;
            if (elements > 0) {
                for (int t = j; t < m; t++) {
                    System.out.println(mat[i][t]);
                    elements--;
                    j++;
                }
            }
            j--;
            i--;
            if (elements > 0) {
                for (int t = i; t >= k; t--) {
                    System.out.println(mat[t][j]);
                    elements--;
                    i--;
                }
            }
            i++;
            j--;
            if (elements > 0) {
                for (int t = j; t > k; t--) {
                    System.out.println(mat[i][t]);
                    elements--;
                    j--;
                }
            }
            j++;
            n--;
            m--;
            k++;
            i++;
        }

    }

}