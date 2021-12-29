/*Take as input
1. A Number: n

Write a recursive function to print the following pattern to print odd numbers
in decreasing sequence (up until 0) and even numbers in
increasing sequence

Example(To be used only for expected output):

Input:
6

output
5
3
1
2
4
6*/

import java.io.*;
import java.util.*;

public class RecursionOddAndEvenNumberPrinting {
    public static void Solve(int n) {
        if (n <= 0) {
            return;
        }

        if (n % 2 == 0) {
            System.out.println(n - 1);
            Solve(n - 2);
            System.out.println(n);
        }

        if (n % 2 != 0) {

            System.out.println(n - 1);
            Solve(n - 1);
        }

    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Solve(n);
    }
}