
import java.io.*;
import java.util.*;

public class DifferenceOfTwoArrays {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++)
            a1[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++)
            a2[i] = scn.nextInt();

        int borrow = 0;
        int n3 = Math.max(n1, n2) + 1;
        int[] res = new int[n3];
        int i = n1 - 1, j = n2 - 1, k = n3 - 1;
        while (k > 0) {
            int d1 = i >= 0 ? a1[i--] : 0;
            int d2 = j >= 0 ? a2[j--] : 0;

            int s = d2 - d1 + borrow;
            if (s < 0) {
                borrow = -1;
                s = s + 10;
            } else {
                borrow = 0;
            }

            res[k--] = s % 10;
        }

        int flag = 0;
        for (i = 0; i < n3; i++) {
            if (res[i] > 0)
                flag = 1;

            if (flag == 1)
                System.out.println(res[i]);
        }

    }

}