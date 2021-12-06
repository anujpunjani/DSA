
import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int add(int b, int n1, int n2) {
        int res = 0;
        int mul = 1;
        int carry = 0;
        while (carry > 0 || n1 > 0 || n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            int sum = d1 + d2 + carry;

            int quot = sum / b;
            int rem = sum % b;

            carry = quot;
            res += rem * mul;
            mul *= 10;
            n1 /= 10;
            n2 /= 10;

        }

        return res;

    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int pro = 0;
        int p = 0;
        int c = 1;
        int cr = 0;
        while (n2 != 0) {
            int apro = 0;
            int s2 = n2 % 10;
            int temp = n1;
            while (temp != 0 || cr != 0) {
                int t = temp % 10;
                int s = t * s2 + cr;

                apro += s % b * Math.pow(10, p);
                cr = s / b;
                p++;
                temp /= 10;
            }

            pro = add(b, pro, apro * c);
            cr = 0;
            p = 0;
            c *= 10;
            n2 /= 10;
        }

        return pro;

    }

}