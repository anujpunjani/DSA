
import java.io.*;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(0, str, "");
    }

    public static void printSS(int idx, String str, String ans) {
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }

        printSS(idx + 1, str, ans + str.charAt(idx));
        printSS(idx + 1, str, ans);

    }

}