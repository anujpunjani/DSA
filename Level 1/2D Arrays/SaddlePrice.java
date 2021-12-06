import java.io.*;
import java.util.*;

public class SaddlePrice {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }

        int flag = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int d1 = 0;
            int d2 = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < min) {
                    min = mat[i][j];
                    d1 = i;
                    d2 = j;
                }
            }

            int max = min;
            for (int j = 0; j < n; j++) {
                if (max < mat[j][d2])
                    max = mat[j][d2];
            }

            if (max == min) {
                System.out.println(min);
                flag = 1;
                break;
            }

        }

        if (flag == 0)
            System.out.println("Invalid input");

    }

}