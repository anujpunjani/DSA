
import java.io.*;
import java.util.*;

public class SubsetsOfArray {

    public static int d2b(int n) {
        int mul = 1;
        int res = 0;
        while (n > 0) {
            int d = n % 2;
            res += d * mul;
            mul *= 10;
            n /= 2;
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int totalSubsets = (int) Math.pow(2, n);

        for (int i = 0; i < totalSubsets; i++) {
            int binary = d2b(i);
            int temp = n;
            while (temp > 0) {
                int power = (int) Math.pow(10, temp - 1);
                int bit = (binary / power) % 10;
                if (bit == 1)
                    System.out.print(arr[n - temp] + "\t");
                else
                    System.out.print("-\t");

                temp--;
            }
            System.out.println();
        }

    }

}