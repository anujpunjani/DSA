/*In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the string in reverse e.g. abc -> cba. Iterating through each string, compare the absolute difference in the ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.
Determine whether a give string is funny. If it is, return Funny, otherwise return Not Funny.

Example
s = "lmnop"
The ordinal values of the charcters are [108, 109, 110, 111, 112]. s(reverse) = "ponml" and the ordinals are [112, 111, 110, 109, 108]. The absolute differences of the adjacent elements for both strings are [1, 1, 1, 1], so the answer is Funny.

Function Description

Complete the funnyString function in the editor below.

funnyString has the following parameter(s):

string s: a string to test
Returns

string: either Funny or Not Funny
Input Format

The first line contains an integer , the number of queries.
The next  lines each contain a string, .

Sample Input

STDIN   Function
-----   --------
2       q = 2
acxz    s = 'acxz'
bcxz    s = 'bcxz'
Sample Output

Funny
Not Funny
*/

import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        // Write your code here
        StringBuilder r = new StringBuilder(s);
        r.reverse();

        int[] re = new int[s.length()];
        int[] se = new int[s.length()];

        for (int i = 0; i < s.length() - 1; i++) {
            re[i] = Math.abs((int) r.charAt(i) - (int) r.charAt(i + 1));
            se[i] = Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
        }

        for (int i = 0; i < s.length() - 1; i++) {
            System.out.print(re[i] + " ");
        }

        for (int i = 0; i < s.length() - 1; i++) {
            System.out.print(se[i] + " ");
        }

        if (Arrays.equals(se, re))
            return "Funny";
        else
            return "Not Funny";

    }

}

public class FunnyString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
