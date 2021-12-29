/*1.Take an input r, the size of row.
2.Take an input c, the size of column.
2.Take r*c more inputs and store that in an array.


Write a function Wave print it row-wise and then column wise.

Example(To be used only for expected output):
Input:
3 3
1 2 3
4 5 6
7 8 9
Output:
1 2 3 6 5 4 7 8 9
1 4 7 8 5 2 3 6 9*/

import java.io.*;
import java.util.*;

public class TwoDArrayWavePrint {

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

        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }

        }
        System.out.println();
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < r; j++) {
                    System.out.print(mat[j][i] + " ");
                }
            } else {
                for (int j = r - 1; j >= 0; j--) {
                    System.out.print(mat[j][i] + " ");
                }
            }

        }
    }
}