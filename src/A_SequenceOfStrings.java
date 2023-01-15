package src;
import java.util.*;

public class A_SequenceOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        String ans = "No";
        
        if (b/a == 2) {
            ans = "Yes";
        }

        if (a == 1 && b == 3) {
            ans = "Yes";
        }
        
        System.out.println((ans));
    }
}