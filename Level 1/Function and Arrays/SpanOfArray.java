
import java.io.*;
import java.util.*;

public class SpanOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println(max - min);

    }

}