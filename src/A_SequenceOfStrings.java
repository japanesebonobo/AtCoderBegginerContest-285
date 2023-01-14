package src;
import java.util.*;

public class A_SequenceOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next();
        }
        scanner.close();

        for (int i = 0; i < S.length; i++) {
            System.out.println(S[N-i-1]);
        }
    }
}