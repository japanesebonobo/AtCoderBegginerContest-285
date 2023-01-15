package src;
import java.util.*;

public class B_MultiTestCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        char s[] = S.toCharArray();
        
        int l = 1;
        for (int i = 1; i < N; i++) { 
            int counter = 0;
            for (int j = 0; j < s.length; j++) {
                if (j+l>N-1) {
                    break;
                }
                if(s[j] == s[j+l]) {
                    break;
                }
                counter++;
            }
            if (counter == 0) {
                System.out.println(0);
            } else {
                System.out.println(counter);
            }
            l++;
        }
    }
}