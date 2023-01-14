package src;
import java.util.*;

public class B_MultiTestCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int ans[] = new int[T];
        for (int i = 0; i < T; i++) { 
            int N = scanner.nextInt();
            int A[] = new int[N];
            for (int j = 0; j < A.length; j++) {
                A[j] = scanner.nextInt();
                if (A[j]%2 != 0) {
                    ans[i]++;
                }
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}