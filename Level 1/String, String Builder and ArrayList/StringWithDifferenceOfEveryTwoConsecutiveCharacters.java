import java.io.*;
import java.util.*;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

    public static String solution(String str) {
        // write your code here
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < str.length() - 1; i++) {
            res.append(str.charAt(i));
            res.append(str.charAt(i + 1) - str.charAt(i));
        }
        res.append(str.charAt(str.length() - 1));
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }

}