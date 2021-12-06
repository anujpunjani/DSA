
import java.util.*;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
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
}