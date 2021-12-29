
import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(getMazePaths(0, 0, n - 1, m - 1));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (sr > dr || sc > dc) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> smallAns1 = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> smallAns2 = getMazePaths(sr + 1, sc, dr, dc);

        for (String str : smallAns1) {
            ans.add("h" + str);
        }

        for (String str : smallAns2) {
            ans.add("v" + str);
        }

        return ans;
    }

}