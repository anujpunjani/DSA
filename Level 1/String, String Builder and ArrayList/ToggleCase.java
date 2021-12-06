import java.util.*;

public class ToggleCase {

    public static String toggleCase(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch <= 'z' && ch >= 'a')
                res += (char) (ch - 32);
            else
                res += (char) (ch + 32);
        }

        return res;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(toggleCase(str));

    }
}