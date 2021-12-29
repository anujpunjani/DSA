
/*
 * The number, its base and the required base of the output number is taken as
 * input.
 * 
 * The base of number can be anything such that all digits can be represented
 * using 0 to 9 and A to Z. Value of A is 10, value of B is 11 and so on.
 * 
 * For example,
 * 
 * INPUT :
 * 
 * 100001
 * 2
 * 10
 * 
 * OUTPUT :
 * 
 * 33
 */
import java.io.*;
import java.util.*;

public class numberinanybasetoanybase {

    public static int anytodec(String n, int b) {

        int multipler = 1;
        int res = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            int d = 0;
            char ch = n.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                d = ch - 'a' + 10;
            else
                d = ch - '0';

            res = res + d * multipler;
            multipler *= b;
        }

        return res;
    }

    public static StringBuilder dectoany(int n, int b) {
        StringBuilder res = new StringBuilder("");

        while (n > 0) {
            int d = n % b;

            if (d < 10)
                res.append(d);
            else
                res.append((char) (d + 'a' - 10));

            n /= b;
        }
        return res.reverse();
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();
        int b = scn.nextInt();
        int d = scn.nextInt();

        int no = anytodec(n, b);
        StringBuilder res = dectoany(no, d);

        System.out.println(res);
        // System.out.println(Integer.toString(no, d));

    }
}