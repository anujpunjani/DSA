
import java.util.*;

public class AnyBaseSubtraction {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        if (n1 < n2) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }
        // write your code here
        int c = 0;
        int d = 0;
        int p = 0;
        while (n1 != 0 || n2 != 0) {
            int s1 = n1 % 10 + c;
            int s2 = n2 % 10;

            if (s1 < s2) {
                c = -1;
                s1 += b;
            } else {
                c = 0;
            }

            d += (s1 - s2) * Math.pow(10, p);
            p++;
            n1 /= 10;
            n2 /= 10;
        }
        return d;
    }

}