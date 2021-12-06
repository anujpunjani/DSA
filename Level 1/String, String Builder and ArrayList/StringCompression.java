import java.io.*;
import java.util.*;

public class StringCompression {

    public static String compression1(String str) {
        // write your code here
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1))
                res += str.charAt(i);

        }

        return res;
    }

    public static String compression2(String str) {
        // write your code here
        String res = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                if (i > 0 && count > 1)
                    res += count;
                res += str.charAt(i);
                count = 0;
            }
            count++;
        }

        if (count > 1)
            res += count;

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}