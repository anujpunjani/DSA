
import java.io.*;
import java.util.*;

public class BarChart {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int k = 0; k < n; k++) {
            arr[k] = scn.nextInt();
        }

        int m = -1;
        for (int k = 1; k < n; k++) {
            if (arr[k] > m) {
                m = arr[k];
            }
        }

        for (int i = m; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i <= arr[j]) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}