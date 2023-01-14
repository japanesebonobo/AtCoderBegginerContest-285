package src;
import java.util.*;

public class D_HappyNewYear2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        long ans[][] = new long[T][2];
        for (int i = 0; i < T; i++) { 
            long N = scanner.nextLong();
            for (int j = 2; j < Math.sqrt(N); j++) {
                long p = N/(long)Math.pow(j, 2);
                if (isPrimeNumber(p)) {
                    ans[i][0] = j;
                    ans[i][1] = p;
                }
            }
        }
        for (int i = 0; i < T; i++) {
            System.out.println(ans[i][0]);
            System.out.println(ans[i][1]);
        }
    }

    public static boolean isPrimeNumber(long N) {
        if (N < 2) {
            return false;
        }
        if (N == 2) {
            return true;
        }
        for (int i = 3; i < N;) {
            if (N % i == 0) {
              return false;
            }
            i+=2;
        }
        return true;
    }
}