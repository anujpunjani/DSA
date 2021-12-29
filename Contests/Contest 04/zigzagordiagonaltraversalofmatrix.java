
/*Given a 2D matrix, print all elements of the given matrix in diagonal order. For example, consider the following 5 X 4 input matrix.

input:
5 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
17 18 19 20
   
output:
1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20*/
import java.io.*;
import java.util.*;

public class zigzagordiagonaltraversalofmatrix {

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

        int elements = r * c;

        for (int gap = 0; gap < r; gap++) {
            // gap = gap>=c?c-1:gap;
            for (int i = gap, j = 0; j <= gap; j++, i--) {
                if (j >= c)
                    break;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        for (int gap = 1; gap < c; gap++) {
            for (int i = r - 1, j = gap; j <= c - 1; j++, i--) {
                if (j >= c)
                    break;
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}