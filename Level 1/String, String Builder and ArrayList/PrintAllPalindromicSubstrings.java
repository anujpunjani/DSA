import java.io.*;
import java.util.*;

public class PrintAllPalindromicSubstrings {

    public static boolean isPalindrome(String str) {
        // write your code here
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void solution(String str) {
        // write your code here

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str.substring(i, j + 1))) {
                    System.out.println(str.substring(i, j + 1));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}