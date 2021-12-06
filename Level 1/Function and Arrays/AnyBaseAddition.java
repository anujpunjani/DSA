
import java.util.*;

public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int c = 0;
        int sum = 0;
        int p = 0;
        while (n1 != 0 || n2 != 0) {
            int s = n1 % 10 + n2 % 10 + c;
            if (s >= b) {
                sum += s % b * Math.pow(10, p);
                c = 1;
            } else {
                sum += s * Math.pow(10, p);
                c = 0;
            }
            n1 /= 10;
            n2 /= 10;
            p++;
        }

        if (c > 0)
            sum += c * Math.pow(10, p);

        return sum;
    }
}