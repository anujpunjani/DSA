import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        printPermutations(input, "");
    }

    public static void printPermutations(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            String in = input.substring(0, i) + input.substring(i + 1);
            printPermutations(in, output + input.charAt(i));
        }

    }

}