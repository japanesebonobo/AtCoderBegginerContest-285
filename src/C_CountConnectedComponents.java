package src;
import java.util.*;

public class C_CountConnectedComponents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] vertex = new int[N];
        for (int i = 0; i < vertex.length; i++) {
            vertex[i] = i;
        }
        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt()-1;
            int v = scanner.nextInt()-1;
            union(vertex, u, v);
        }
        scanner.close();
        HashSet<Integer> forests = new HashSet<>();
        for(int i = 0; i < N; i++) {
            forests.add(root(vertex,i));
        }
        System.out.println(forests.size());
    }    

    public static int root(int[] tree, int x) {
        if (tree[x] == x) return x;
        else return tree[x] = root(tree, tree[x]);
    }

    public static void union(int[] tree, int x, int y) {
        int rx = root(tree, x);
        int ry = root(tree, y);
        tree[rx] = ry;
    }
}