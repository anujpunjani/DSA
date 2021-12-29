import java.io.*;
import java.util.*;

public class GetKPC {

    static String[] dtoc = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(getKPC(0, s));
    }

    public static ArrayList<String> getKPC(int idx, String str) {

        if (idx == str.length()) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> smallAns = getKPC(idx + 1, str);
        ArrayList<String> ans = new ArrayList<>();

        for (Character letter : dtoc[str.charAt(idx) - '0'].toCharArray()) {
            for (String s : smallAns) {
                ans.add(letter + s);
            }
        }

        return ans;
    }

}