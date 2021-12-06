
import java.io.*;
import java.util.*;

public class FindElementInAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        int flag = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = i;
                break;
            }
        }

        System.out.println(flag);

    }

}