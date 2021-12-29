
/*Take as input
1. first number: n
2. second number: r

Print n!, npr & ncr separated by lines.*/
import java.io.*;
import java.util.*;

public class Combinations {

    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        System.out.println(fact(n));
        System.out.println(fact(n) / fact(n - r));
        System.out.println(fact(n) / (fact(n - r) * fact(r)));

    }
}