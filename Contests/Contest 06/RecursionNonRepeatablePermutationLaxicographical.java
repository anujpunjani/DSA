
/*Take as input str, a string. We are concerned with all possible permutations of
 characters in str. E.g. “abc” can produce following words “abc”, “acb”, “bac”,
  “bca”, “cab”, “cba”

a. Write a recursive function which returns the count of different permutations
 for a given string(repetition not allowed). Print the value returned.

b. Write a recursive function which prints all possible permutations for a
given string in Laxicographical Order
(repetition not allowed and void is the return type for function).

Example(To be used only for expected output):
Input:
213

output
6
123
132
213
231
312
321*/
import java.io.*;
import java.util.*;

public class RecursionNonRepeatablePermutationLaxicographical {

    static ArrayList<String> al = new ArrayList<>();

    public static int count(String input, String output) {
        if (al.contains(output))
            return 0;

        if (input.length() == 0) {
            al.add(output);
            return 1;
        }
        int ans = 0;
        for (int i = 0; i < input.length(); i++) {
            String in = input.substring(0, i) + input.substring(i + 1);
            ans += count(in, output + input.charAt(i));
        }
        return ans;
    }

    public static void print(String input, String ans) {
        if (al.contains(ans))
            return;

        if (input.length() == 0) {
            al.add(ans);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            String in = input.substring(0, i) + input.substring(i + 1);
            print(in, ans + input.charAt(i));
        }
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
        String input = scn.next();
        int n = count(input, "");
        System.out.println(n);

        print(input, "");
        Collections.sort(al);
        print(0, al);

    }
}