
/*1.Take an input N, the size of array.
2.Take N more inputs and store that in an array.

Write a function which returns true if the second array is inverse of first and
false otherwise. Print the value returned.

Example(To be used only for expected output):
Input:
4
1 2 3 0
3 0 1 2
Output:
true
*/
import java.io.*;
import java.util.*;

public class OneDArrayIsInverse {

    public static int[] inver(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr[i]] = i;
        }

        return res;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        int[] inv = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        for (int i = 0; i < n; i++)
            inv[i] = scn.nextInt();

        int[] res = inver(arr);

        System.out.print(Arrays.equals(res, inv));

    }
}