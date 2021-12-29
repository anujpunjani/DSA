
import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {

        if (n < 0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        } else if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> Smallans1 = getStairPaths(n - 1);
        ArrayList<String> Smallans2 = getStairPaths(n - 2);
        ArrayList<String> Smallans3 = getStairPaths(n - 3);

        ArrayList<String> ans = new ArrayList<>();

        for (String str : Smallans1)
            ans.add(1 + str);

        for (String str : Smallans2)
            ans.add(2 + str);

        for (String str : Smallans3)
            ans.add(3 + str);

        return ans;
    }

}