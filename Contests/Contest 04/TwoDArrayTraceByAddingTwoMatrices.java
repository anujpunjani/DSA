
/*1.Take an input r, the size of row.
2.Take an input c, the size of column.
3.Take r*c more inputs and store that in an Matrix.
4.Take r*c more inputs and store that in an another Matrix.


Consider two matrix ANXM, BNXM. Both matrix A and matrix B contains equal
elements. The task is to find the trace of the matrix formed by addition of
A and B. Trace of matrix PNXM is defined as
P[0][0] + P[1][1] + P[2][2] +….. + P[min(n – 1, m – 1)][min(n – 1, m – 1)]
i.e addition of main diagonal.

Example(To be used only for expected output):

Input:
3 3
1 2 3
4 5 6
7 8 9
1 4 7
2 5 8
3 6 9

output
30

Explanation:
    1 2 3
A = 4 5 6
    7 8 9

     1 4 7
B =  2 5 8
     3 6 9

        2 6 10
A + B = 6 10 14
        10 14 18

Trace = 2 + 10 + 18 = 30*/
import java.io.*;
import java.util.*;

public class TwoDArrayTraceByAddingTwoMatrices {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];
        int[][] P = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = scn.nextInt();
            }
        }
        int res = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                P[i][j] += mat2[i][j] + mat1[i][j];
                if (i == j)
                    res += P[i][j];

            }
        }

        System.out.print(res);

    }
}