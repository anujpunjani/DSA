import java.io.*;
import java.util.*;

public class ExitPointOfAMatrix {

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

        int currRow = 0, currCol = 0;
        int prevRow = 0, prevCol = 0;

        int direction = 0;

        while (currCol >= 0 && currRow < n && currCol < m && currRow >= 0) {
            if (mat[currRow][currCol] == 1)
                direction = (direction + 1) % 4;

            prevRow = currRow;
            prevCol = currCol;

            if (direction == 0)
                currCol++;
            else if (direction == 1)
                currRow++;
            else if (direction == 2)
                currCol--;
            else
                currRow--;

        }

        System.out.println(prevRow);
        System.out.println(prevCol);

    }

}