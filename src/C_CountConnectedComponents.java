package src;
import java.util.*;

public class C_CountConnectedComponents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        char []s = S.toCharArray();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        long ans = 0;

        for (int i = 0; i < s.length; i++) {
            String now = String.valueOf(s[i]);
            long num = alphabet.indexOf(now)+1;
            if (i == s.length-1) {
                ans += num;
            } else {
                ans += (num)*Math.pow(26,(s.length-i-1));
            }
        }
        System.out.println(ans);
    }
}