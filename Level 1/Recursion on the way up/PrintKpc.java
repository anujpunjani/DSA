
import java.io.*;
import java.util.*;

public class PrintKpc {
    static String[] dtoc = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printKPC(0, s, "");
    }

    public static void printKPC(int idx, String input, String output) {
        if (idx == input.length()) {
            System.out.println(output);
            return;
        }

        for (Character letter : dtoc[input.charAt(idx) - '0'].toCharArray())
            printKPC(idx + 1, input, output + letter);

    }

}