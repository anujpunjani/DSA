
import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int any = any(n, sourceBase, destBase);
        System.out.println(any);

    }

    public static int any(int n, int b1, int b2) {
        int d = getValueIndecimal(n, b1);
        int b = getValueInBase(d, b2);
        return b;
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int out = 0;
        int p = 0;
        while (n != 0) {
            out += n % b * Math.pow(10, p);
            p++;
            n /= b;
        }
        return out;
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int decimal = 0;
        int p = 0;
        while (n != 0) {
            decimal += n % 10 * Math.pow(b, p);
            p++;
            n /= 10;
        }
        return decimal;
    }

}