package Day2;

import java.util.*;
import java.io.*;

public class full_Permutation {
    static int n;
    static int[] path;
    static boolean[] visited;

    static void main() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        path = new int[n];
        visited = new boolean[n + 1];
        dfs(0);
    }


    static void dfs(int step){
        if(step == n){
            for(int i = 0; i < n; i++){
                System.out.print(path[i] + " ");
            }
            System.out.println(" ");
        }else{
            for(int i = 1; i <= n; i++){
                if(visited[i] == false){
                    path[step] = i;
                    visited[i] = true;
                    dfs(step + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
