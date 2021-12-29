
/*1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.


Write a function Spiral print it clock wise and then anti-clock wise

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 9 8 7 4 5
1 4 7 8 9 6 3 2 5*/
import java.io.*;
import java.util.*;

public class TwoDArraySpiralPrint {

    public static void clockwise(int[][] mat) {
        int elements = mat.length * mat[0].length;
        int n = mat.length;
        int m = mat[0].length;

        int i = 0, j = 0, k = 0;
        while (elements > 0) {
            for (int t = j; t < m; t++) {
                System.out.print(mat[i][t] + " ");
                elements--;
                j++;
                if (elements <= 0)
                    return;
            }
            i++;
            j--;
            for (int t = i; t < n; t++) {
                System.out.print(mat[t][j] + " ");
                elements--;
                i++;
                if (elements <= 0)
                    return;
            }
            i--;
            j--;
            for (int t = j; t >= k; t--) {
                System.out.print(mat[i][t] + " ");
                elements--;
                j--;
                if (elements <= 0)
                    return;
            }
            j++;
            i--;
            for (int t = i; t > k; t--) {
                System.out.print(mat[t][j] + " ");
                elements--;
                i--;
                if (elements <= 0)
                    return;
            }
            k++;
            n--;
            m--;
            i++;
            j++;

        }
    }

    public static void anticlockwise(int[][] mat) {
        int elements = mat.length * mat[0].length;
        int n = mat.length;
        int m = mat[0].length;

        int i = 0, j = 0, k = 0;
        while (elements > 0) {
            for (int t = i; t < n; t++) {
                System.out.print(mat[t][j] + " ");
                elements--;
                i++;
                if (elements <= 0)
                    return;
            }
            i--;
            j++;
            for (int t = j; t < m; t++) {
                System.out.print(mat[i][t] + " ");
                elements--;
                j++;
                if (elements <= 0)
                    return;
            }
            i--;
            j--;
            for (int t = i; t >= k; t--) {
                System.out.print(mat[t][j] + " ");
                elements--;
                i--;
                if (elements <= 0)
                    return;
            }
            j--;
            i++;
            for (int t = j; t > k; t--) {
                System.out.print(mat[i][t] + " ");
                elements--;
                j--;
                if (elements <= 0)
                    return;
            }
            k++;
            n--;
            m--;
            i++;
            j++;

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        clockwise(mat);
        System.out.println();
        anticlockwise(mat);

    }
}