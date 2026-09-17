package Day2;
import java.util.Scanner;

public class important_model{

    static int n;
    static int[] path;       // 记录当前排列的数字
    static boolean[] visited; // 标记数字是否被用过

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        path = new int[n];
        visited = new boolean[n + 1]; // 数字从1到n，所以开n+1
        dfs(0);
    }

    // step 代表当前排到第几个位置了（从0开始）
    static void dfs(int step) {
        // 1. 到达终点（出口）
        if (step == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println();
            return;
        }
        else {
            // 2. 遍历所有可能的选择（1到n的数字）
            for (int i = 1; i <= n; i++) {
                // 如果数字i还没被用过
                if (!visited[i]) {
                    // 做选择
                    path[step] = i;
                    visited[i] = true;

                    // 递归下一层
                    dfs(step + 1);

                    // 撤销选择（回溯！这一步最重要，忘了就全错）
                    visited[i] = false;
                }
            }
        }
    }
}
