
/*1. You will be given 2 integer numbers and their base respectively.
2. You will also be given an number representing destination base.
3. You have to add those numbers and give the result of addition in destination base.*/
import java.io.*;
import java.util.*;

public class Adding2numbers {

    public static int anytodec(int n, int b) {
        int res = 0;
        int mul = 1;
        while (n > 0) {
            int d = n % 10;
            res += d * mul;
            n /= 10;
            mul *= b;
        }
        return res;
    }

    public static int dectoany(int n, int b) {
        int res = 0;
        int mul = 1;
        while (n > 0) {
            int d = n % b;
            res += d * mul;
            n /= b;
            mul *= 10;
        }
        return res;
    }

    public static int add(int n1, int n2) {
        int carry = 0;
        int res = 0;
        int mul = 1;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int s = d1 + d2 + carry;

            carry = s / 10;
            res += s % 10 * mul;
            n1 /= 10;
            n2 /= 10;
            mul *= 10;
        }

        return res;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int b1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b2 = scn.nextInt();
        int d = scn.nextInt();

        System.out.println(dectoany(add(anytodec(n1, b1), anytodec(n2, b2)), d));

    }
}