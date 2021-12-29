import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {

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

        ArrayList<String> ans = new ArrayList<>();

        int jump = 1;
        while (sc + jump <= dc) {
            ArrayList<String> rightpaths = getMazePaths(sr, sc + jump, dr, dc);
            for (String path : rightpaths)
                ans.add("h" + jump + path);
            jump++;
        }

        jump = 1;
        while (sr + jump <= dr) {
            ArrayList<String> downpaths = getMazePaths(sr + jump, sc, dr, dc);
            for (String path : downpaths)
                ans.add("v" + jump + path);
            jump++;
        }

        jump = 1;
        while (sr + jump <= dr && sc + jump <= dc) {
            ArrayList<String> dpaths = getMazePaths(sr + jump, sc + jump, dr, dc);
            for (String path : dpaths)
                ans.add("d" + jump + path);
            jump++;
        }

        return ans;
    }

}