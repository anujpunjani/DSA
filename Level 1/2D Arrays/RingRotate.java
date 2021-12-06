
import java.io.*;
import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int r = scn.nextInt();

        rotateShell(arr, s, r);
        display(arr);
    }

    public static void rotateShell(int[][] arr, int s, int r) {
        int[] oned = fillOnedFromShell(arr, s);
        rotate(oned, r);
        fillShellFromOned(arr, s, oned);

    }

    public static int[] fillOnedFromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int size = 2 * (maxr - minr + maxc - minc);

        int[] oned = new int[size];

        // lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[idx++] = arr[i][j];
        }
        minc++;
        for (int i = maxr, j = minc; j <= maxc; j++) {
            oned[idx++] = arr[i][j];
        }
        maxr--;
        for (int i = maxr, j = maxc; i >= minr; i--) {
            oned[idx++] = arr[i][j];
        }
        maxc--;
        for (int i = minr, j = maxc; j >= minc; j--) {
            oned[idx++] = arr[i][j];
        }

        return oned;

    }

    public static void fillShellFromOned(int[][] arr, int s, int[] oned) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        // lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = oned[idx++];
        }
        minc++;
        for (int i = maxr, j = minc; j <= maxc; j++) {
            arr[i][j] = oned[idx++];
        }
        maxr--;
        for (int i = maxr, j = maxc; i >= minr; i--) {
            arr[i][j] = oned[idx++];
        }
        maxc--;
        for (int i = minr, j = maxc; j >= minc; j--) {
            arr[i][j] = oned[idx++];
        }
    }

    public static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if (r < 0)
            r = r + oned.length;
        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] oned, int i, int j) {
        while (i < j) {
            int temp = oned[i];
            oned[i] = oned[j];
            oned[j] = temp;
            i++;
            j--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}