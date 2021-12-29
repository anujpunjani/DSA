import java.io.*;
import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(gss(0, s));
    }

    public static ArrayList<String> gss(int idx, String str) {
        if (str.length() == idx) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }

        ArrayList<String> ar = gss(idx + 1, str);

        ArrayList<String> ans = new ArrayList<>();

        for (String subset : ar)
            ans.add(subset);

        for (String subset : ar)
            ans.add(str.charAt(idx) + subset);

        return ans;
    }

}