/*Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and
columns on a rectangular board.

Our player starts in top-left corner of the board and must reach bottom-right
corner. In one move the player can move 1 step horizontally (right) or 1 step
vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the
player can travel across the board. Print the value returned.

b. Write a recursive function which returns an ArrayList of moves for all valid
paths across the board. Print the value returned.

c. Write a recursive function which prints moves for all valid paths across the
board (void is the return type for function).

Example(To be used only for expected output):
Input:
2 2
output

13
[HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]
HHVV
HVHV
HVVH
HVD
HDV
VHHV
VHVH
VHD
VVHH
VDH
DHV
DVH
DD*/

import java.io.*;
import java.util.*;

public class RecursionDiagonalMoveInMazzePath {

    public static int count(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            return 1;
        } else if (sr > dr || sc > dc)
            return 0;

        int ans = 0;

        int hpath = count(sr, sc + 1, dr, dc);
        int vpath = count(sr + 1, sc, dr, dc);
        int dpath = count(sr + 1, sc + 1, dr, dc);

        ans = hpath + vpath + dpath;
        return ans;
    }

    public static ArrayList<String> AL(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        } else if (sr > dr || sc > dc) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> hpath = AL(sr, sc + 1, dr, dc);
        for (String path : hpath)
            ans.add("H" + path);
        ArrayList<String> vpath = AL(sr + 1, sc, dr, dc);
        for (String path : vpath)
            ans.add("V" + path);
        ArrayList<String> dpath = AL(sr + 1, sc + 1, dr, dc);
        for (String path : dpath)
            ans.add("D" + path);
        return ans;
    }

    public static void print(int idx, ArrayList<String> paths) {
        if (idx == paths.size()) {
            return;
        }

        System.out.println(paths.get(idx));
        print(idx + 1, paths);
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(count(0, 0, n1, n2));
        ArrayList<String> paths = AL(0, 0, n1, n2);
        System.out.println(paths);
        print(0, paths);
    }
}